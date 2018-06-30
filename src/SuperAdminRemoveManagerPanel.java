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
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuperAdminRemoveManagerPanel extends JPanel {
    
    public SuperAdminRemoveManagerPanel() {
        
        setMinimumSize(new Dimension(500, 900));
        setPreferredSize(new Dimension(500, 900));
        
        GridLayout grid = new GridLayout(3,1);
        setLayout(grid);
        
        JLabel nameLbl = new JLabel(" NAME");
        JTextField nameText = new JTextField();
        nameText.setMinimumSize(new Dimension(50,20));
        nameText.setPreferredSize(new Dimension(50, 20));
        
        JLabel lastnameLbl = new JLabel(" LAST NAME");
        JTextField lastnameText = new JTextField();
        lastnameText.setMinimumSize(new Dimension(50,20));
        lastnameText.setPreferredSize(new Dimension(50, 20));
        
        JPanel btnPanel = new JPanel();
        
        JButton btnLogout = new JButton("LOGOUT");
        JButton btnRemove = new JButton("REMOVE");
        
        btnPanel.add(btnLogout);
        btnPanel.add(btnRemove);
        
        add(nameLbl);
        add(nameText);
        add(lastnameLbl);
        add(lastnameText);
        add(btnPanel);
        
        btnLogout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                EntranceFrame frame = new EntranceFrame();
                frame.setVisible(true);
                
            }
        });
        
        btnRemove.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            boolean ismanager = false;
            try {
                String name=nameText.getText();
                String lname=lastnameText.getText();
                FileReader fr1=new FileReader("Manager.txt");
                FileReader fr2=new FileReader("Manager.txt");
                BufferedReader br1=new BufferedReader(fr1);
                BufferedReader br2=new BufferedReader(fr2);
                FileWriter fw2=new FileWriter("man.txt");
                BufferedWriter bw2=new BufferedWriter(fw2);
                String tmp=br1.readLine();
                String[] str;
                    while(tmp!=null){
                        str=tmp.split(":");
                        if (name.equals(str[0]) && lname.equals(str[1])) {
                            ismanager =true;
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
                    FileReader fr4=new FileReader("man.txt");
                    BufferedReader bf=new BufferedReader(fr4);
                    FileWriter fw5=new FileWriter("Manager.txt");
                    BufferedWriter bw5=new BufferedWriter(fw5);
                    String h;
                    do{
                        h=bf.readLine();
                        if(h!=null) {
                            bw5.write(h);
                            bw5.newLine();
                            bw5.flush();
                        }
                    }
                    while(h!=null);
                    fw5.close();
                    } catch (FileNotFoundException ex) {
                        
                    } catch (IOException ex) {
                        
                    }
                    if (ismanager) {
                        System.out.println("manager removed successfully !");  
                    }
                    else
                        System.out.println("-- no manager with this name and lastname exist --");   
            }
        });
        
    }
    
}
