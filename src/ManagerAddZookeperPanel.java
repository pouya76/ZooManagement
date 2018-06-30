import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerAddZookeperPanel extends JPanel {
    
    public ManagerAddZookeperPanel() {
        
        setMinimumSize(new Dimension(700, 500));
        setPreferredSize(new Dimension(700, 500));
        
        GridLayout grid = new GridLayout(10, 1);
        setLayout(grid);
        
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
        JButton btnHire = new JButton("HIRE");
        
        btnPanel.add(btnLogout);
        btnPanel.add(btnHire);
        
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
        
        btnHire.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                Zookeper zook = new Zookeper(firstNameText.getText(), lastNameText.getText(), userNameText.getText(), passwordText.getText(), phoneNumberText.getText(), emailText.getText(), departmentText.getText(), addressText.getText() , salaryText.getText());
                String name=firstNameText.getText();
                String lname = lastNameText.getText();
                String uname=userNameText.getText();
                String pass =passwordText.getText();
                String phone=phoneNumberText.getText();
                String mail = emailText.getText();
                String dep= departmentText.getText();
                String address= addressText.getText();
                String salary = salaryText.getText();
                
                if (!(name.equals("")) && !(lname.equals("")) && !(uname.equals("")) && !(pass.equals("")) && !(phone.equals("")) && !(mail.equals("")) && !(dep.equals("")) && !(address.equals("")) && !(salary.equals(""))) {
                    zook.addZookeper(firstNameText.getText(), lastNameText.getText(), userNameText.getText(), passwordText.getText(), phoneNumberText.getText(), emailText.getText(), departmentText.getText(), addressText.getText() , salaryText.getText());
                    System.out.println("zookeper added successfully !");
                }
                else{
                     System.out.println("----complete all fields---");
                }
                
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
