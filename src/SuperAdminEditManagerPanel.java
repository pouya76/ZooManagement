import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperAdminEditManagerPanel extends JPanel {
    
    public SuperAdminEditManagerPanel() {
        
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
        
        JButton btnEditAndSave = new JButton("EDIT AND SAVE");
        JButton btnLogout = new JButton("LOGOUT");
        
        btnPanel.add(btnEditAndSave);
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
        
        /*btnEditAndSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String name = nameText.getText();
                String lastname = lastnameText.getText();
                String username = usernameText.getText();
                String password = passwordText.getText();
                String phoneNumber = phoneNumberText.getText();
                String address =  addressText.getText();
                String email = emailText.getText();
                String salary = salaryText.getText();
                
                try{
                    
                    for(int i=0 ; i<Manager.managerList.size() ; i++) {
                    
                    if(name.equals(Manager.managerList.get(i).getName())) {
                        
                        if(lastname.equals(Manager.managerList.get(i).getLastname())) {
                            
                            Manager.managerList.get(i).setUsername(username);
                            Manager.managerList.get(i).setPassword(password);
                            Manager.managerList.get(i).setPhoneNumber(phoneNumber);
                            Manager.managerList.get(i).setAddress(address);
                            Manager.managerList.get(i).setEmail(email);
                            Manager.managerList.get(i).setSalary(salary);
                            
                            JOptionPane.showMessageDialog(null, Manager.managerList.get(i).getName() + " " + Manager.managerList.get(i).getLastname() +  "has been edited !");
                            
                        }else {
                            
                            JOptionPane.showMessageDialog(null, "Wrong Lastname");
                            
                        }
                        
                    }else {
                        
                        JOptionPane.showMessageDialog(null, "Wrong name !");
                        
                    }
                    
                }
                    
                }catch(Exception ee) {
                    
                    JOptionPane.showMessageDialog(null, ee.getMessage());
                    
                }
  
            }
        });
        */
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
