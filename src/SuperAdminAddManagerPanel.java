import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class SuperAdminAddManagerPanel extends JPanel {
    
    public SuperAdminAddManagerPanel() {
        
        setMinimumSize(new Dimension(500, 900));
        setPreferredSize(new Dimension(500, 900));
        
        GridLayout centerLayout = new GridLayout(9, 1);
        setLayout(centerLayout);
        
        JLabel nameLbl = new JLabel(" NAME");
        JTextField nameText = new JTextField();
        nameText.setMinimumSize(new Dimension(50,20));
        nameText.setPreferredSize(new Dimension(50, 20));
        
        JLabel lastnameLbl = new JLabel(" LAST NAME");
        JTextField lastnameText = new JTextField();
        lastnameText.setMinimumSize(new Dimension(200,30));
        lastnameText.setPreferredSize(new Dimension(200, 30));
        
        JLabel usernameLbl = new JLabel(" USERNAME");
        JTextField usernameText = new JTextField();
        usernameText.setMinimumSize(new Dimension(200,30));
        usernameText.setPreferredSize(new Dimension(200, 30));
        
        JLabel passwordLbl = new JLabel(" PASSWORD");
        JTextField passwordText = new JTextField();
        passwordText.setMinimumSize(new Dimension(200,30));
        passwordText.setPreferredSize(new Dimension(200,30));
        
        JLabel phoneNumberLbl = new JLabel(" PHONE NUMBER");
        JTextField phoneNumberText = new JTextField();
        phoneNumberText.setMinimumSize(new Dimension(200,30));
        phoneNumberText.setPreferredSize(new Dimension(200,30));
        
        JLabel addressLbl = new JLabel(" ADDRESS");
        JTextField addressText = new JTextField();
        addressText.setMinimumSize(new Dimension(200,30));
        addressText.setPreferredSize(new Dimension(200,30));
        
        JLabel emailLbl = new JLabel(" Email");
        JTextField emailText = new JTextField();
        emailText.setMinimumSize(new Dimension(200,30));
        emailText.setPreferredSize(new Dimension(200,30));
        
        JLabel salaryLbl = new JLabel(" SALARY");
        JTextField salaryText = new JTextField();
        salaryText.setMinimumSize(new Dimension(200,30));
        salaryText.setPreferredSize(new Dimension(200,30));
        
        JPanel btnPanel = new JPanel();
        
        JButton btnAdd = new JButton("Add");
        JButton btnLogout = new JButton("LOGOUT");
        
        btnPanel.add(btnAdd);
        btnPanel.add(btnLogout);
        
        add(nameLbl);
        add(nameText);
        add(lastnameLbl);
        add(lastnameText);
        add(usernameLbl);
        add(usernameText);
        add(passwordLbl);
        add(passwordText);
        add(phoneNumberLbl);
        add(phoneNumberText);
        add(addressLbl);
        add(addressText);
        add(emailLbl);
        add(emailText);
        add(salaryLbl);
        add(salaryText);
        
        add(btnPanel);
        
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name =nameText.getText();
                String lname =lastnameText.getText();
                String username =usernameText.getText();
                String password =passwordText.getText();
                String phoneNumber =phoneNumberText.getText();
                String address = addressText.getText();
                String email =emailText.getText();
                String salary =salaryText.getText();
              
                try{
                    
                    String line;
                    FileWriter fw = new FileWriter("Manager.txt",true);
                    BufferedWriter bw  = new BufferedWriter(fw);

                    line = name+":" + lname+":" + username+":" + password+":" + phoneNumber+":" + email+":"+ address+":"+ salary ;
            
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                    bw.close();
        
        
                }catch(Exception ex){
                    
                }
                
                System.out.println("manager added successfully !"); 
                
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
