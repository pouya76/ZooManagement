import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerEditZookeperPanel extends JPanel {
    
    public ManagerEditZookeperPanel() {
        
        setMinimumSize(new Dimension(700, 500));
        setPreferredSize(new Dimension(700, 500));
        
        BoxLayout centerLayout = new BoxLayout(this,BoxLayout.Y_AXIS);
        setLayout(centerLayout);
        
        JLabel firstNameLbl = new JLabel(" FIRST NAME");
        JTextField firstNameText = new JTextField();
        firstNameText.setMinimumSize(new Dimension(50,20));
        firstNameText.setPreferredSize(new Dimension(50, 20));
        
        JLabel lastNameLbl = new JLabel(" Last NAME");
        JTextField lastNameText = new JTextField();
        lastNameText.setMinimumSize(new Dimension(200,30));
        lastNameText.setPreferredSize(new Dimension(200, 30));
        
        JLabel userNameLbl = new JLabel(" USER NAME");
        JTextField userNameText = new JTextField();
        userNameText.setMinimumSize(new Dimension(200,30));
        userNameText.setPreferredSize(new Dimension(200, 30));
        
        JLabel passwordLbl = new JLabel(" PASSWORD");
        JTextField passwordText = new JTextField();
        passwordText.setMinimumSize(new Dimension(200,30));
        passwordText.setPreferredSize(new Dimension(200,30));
        
        JLabel phoneNumberLbl = new JLabel(" PHONE NUMBER");
        JTextField phoneNumberText = new JTextField();
        phoneNumberText.setMinimumSize(new Dimension(200,30));
        phoneNumberText.setPreferredSize(new Dimension(200,30));
        
        JLabel emailLbl = new JLabel(" EMAIL ");
        JTextField emailText = new JTextField();
        emailText.setMinimumSize(new Dimension(200,30));
        emailText.setPreferredSize(new Dimension(200,30));
        
        JLabel departmentLbl = new JLabel(" DEPARTMENT");
        JTextField departmentText = new JTextField();
        departmentText.setMinimumSize(new Dimension(200,30));
        departmentText.setPreferredSize(new Dimension(200,30));
        
        JLabel addressLbl = new JLabel(" ADDRESS");
        JTextField addressText = new JTextField();
        addressText.setMinimumSize(new Dimension(200,30));
        addressText.setPreferredSize(new Dimension(200,30));
        
        JLabel salaryLbl = new JLabel(" SALARY");
        JTextField salaryText = new JTextField();
        salaryText.setMinimumSize(new Dimension(200,30));
        salaryText.setPreferredSize(new Dimension(200,30));
        
        JPanel btnPanel = new JPanel();
        
        JButton btnLogout = new JButton("LOGOUT");
        JButton btnEdit = new JButton("Edit");
        
        btnPanel.add(btnLogout);
        btnPanel.add(btnEdit);
        
        add(firstNameLbl);
        add(firstNameText);
        add(lastNameLbl);
        add(lastNameText);
        add(userNameLbl);
        add(userNameText);
        add(passwordLbl);
        add(passwordText);
        add(phoneNumberLbl);
        add(phoneNumberText);
        add(emailLbl);
        add(emailText);
        add(departmentLbl);
        add(departmentText);
        add(addressLbl);
        add(addressText);
        add(salaryLbl);
        add(salaryText);
        add(btnPanel);
        
        /*btnEdit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String name = firstNameText.getText();
                String lastname = lastNameText.getText();
                String username = userNameText.getText();
                String password = passwordText.getText();
                String phoneNumber = phoneNumberText.getText();
                String email = emailText.getText();
                String department = departmentText.getText();
                String address = addressText.getText();
                String salary = salaryText.getText();
                
                for(int i=0 ; i<Zookeper.zookeeperList.size() ; i++) {
                    
                    if(!name.equals(Zookeper.zookeeperList.get(i).getName())) {
                        
                        if(!lastname.equals(Zookeper.zookeeperList.get(i).getLastname())) {
                            
                            if(username.matches("[(A-Za-z) + (A-Za-z0-9)]")) {
                                
                                if(password.matches("[(A-Za-z) + (A-Za-z0-9) + (A-Za-z0-9.!#)]")) {
                                    
                                    if(email.matches("[(A-Za-z) + (A-Za-z0-9) + (@gmail.com||@yahoo.com)]")) {
                                        
                                        Zookeper.zookeeperList.get(i).setName(name);
                                        Zookeper.zookeeperList.get(i).setLastname(lastname);
                                        Zookeper.zookeeperList.get(i).setUsername(username);
                                        Zookeper.zookeeperList.get(i).setPassword(password);
                                        Zookeper.zookeeperList.get(i).setPhoneNumber(phoneNumber);
                                        Zookeper.zookeeperList.get(i).setEmail(email);
                                        Zookeper.zookeeperList.get(i).setDepartment(department);
                                        
                                        if(department.equals("Aquatic"))
                                            Aquatic_Department.size+=1;
                                        else if(department.equals("Bird"))
                                            Birds_Department.size+=1;
                                        else if(department.equals("Wild"))
                                            Wild_Department.size+=1;
                                        
                                        Zookeper.zookeeperList.get(i).setAddress(address);
                                        Zookeper.zookeeperList.get(i).setSalary(salary);
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
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
