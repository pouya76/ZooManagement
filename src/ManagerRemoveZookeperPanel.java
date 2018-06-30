import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManagerRemoveZookeperPanel extends JPanel {
    
    public ManagerRemoveZookeperPanel() {
        
        setMinimumSize(new Dimension(700, 500));
        setPreferredSize(new Dimension(700, 500));
        
        GridLayout grid = new GridLayout(3, 1);
        setLayout(grid);
        
        JLabel firstNameLbl = new JLabel(" FIRST NAME");
        JTextField firstNameText = new JTextField();
        
        JLabel lastNameLbl = new JLabel(" Last NAME");
        JTextField lastNameText = new JTextField();
        
        JPanel btnPanel = new JPanel();
        
        JButton btnLogout = new JButton("LOGOUT");
        JButton btnFire = new JButton("FIRE");
        
        btnPanel.add(btnLogout);
        btnPanel.add(btnFire);
        
        add(firstNameLbl);
        add(firstNameText);
        add(lastNameLbl);
        add(lastNameText);
        add(btnPanel);
        
        btnFire.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                boolean iszookeper = false;
                try {
                    String name=firstNameText.getText();
                    String lname=lastNameText.getText();
                    FileReader fr1=new FileReader("Zookeper.txt");
                    FileReader fr2=new FileReader("Zookeper.txt");
                    BufferedReader br1=new BufferedReader(fr1);
                    BufferedReader br2=new BufferedReader(fr2);
                    FileWriter fw2=new FileWriter("zookeperdelete.txt");
                    BufferedWriter bw2=new BufferedWriter(fw2);
                    String tmp=br1.readLine();
                    String[] str;
                    while(tmp!=null){
                        str=tmp.split(":");
                        if (name.equals(str[0]) && lname.equals(str[1])) {
                            iszookeper=true;
                            break;
                        }
                        tmp=br1.readLine();
                    }
                    String asli=br2.readLine();
                    while(asli!=null && !(asli.equals(tmp))){
                        bw2.write(asli);
                        bw2.newLine();
                        bw2.flush();
                        asli=br2.readLine();
                    }
                    bw2.flush();
                    asli=br2.readLine();
                    while(asli!=null){
                        bw2.write(asli);
                        bw2.newLine();
                        bw2.flush();
                        asli=br2.readLine();
                    }
                    bw2.flush();
                    fw2.close();
                    FileReader fr4=new FileReader("zookeperdelete.txt");
                    BufferedReader bf=new BufferedReader(fr4);
                    FileWriter fw5=new FileWriter("Zookeper.txt");
                    BufferedWriter bw5=new BufferedWriter(fw5);
                    String h;
                    do{
                        h=bf.readLine();
                        if (h!=null) {
                            bw5.write(h);
                            bw5.newLine();
                            bw5.flush();
                        }
               
                    }
                    while(h!=null);
                    fw5.close();
                }catch (FileNotFoundException ex) {
                }catch (IOException ex) {
                }
                if (iszookeper) {
                    System.out.println("zookeper removed successfully !");  
                }
                else
                    System.out.println("-- no zookeper with this name and lastname exist --");  
            }
        });
        
        btnLogout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                EntranceFrame frame = new EntranceFrame();
                frame.setVisible(true);
                
            }
        });
        
    }
    
}
