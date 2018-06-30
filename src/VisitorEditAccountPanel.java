import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisitorEditAccountPanel extends JPanel {
    
    int flag=0;
     
    public VisitorEditAccountPanel(Visitor v) {
        
        setMinimumSize(new Dimension(700, 500));
        setPreferredSize(new Dimension(700, 500));
        
        GridLayout grid = new GridLayout(10, 1);
        setLayout(grid);
        
        int i=0;
        
        JLabel firstNameLbl = new JLabel(" FIRST NAME");
        JTextField firstNameText = new JTextField(v.getName());
        firstNameText.setMinimumSize(new Dimension(50,20));
        firstNameText.setPreferredSize(new Dimension(50, 20));
        
        JLabel lastNameLbl = new JLabel(" Last NAME");
        JTextField lastNameText = new JTextField(v.getLastname());
        lastNameText.setMinimumSize(new Dimension(200,30));
        lastNameText.setPreferredSize(new Dimension(200, 30));
        
        JLabel userNameLbl = new JLabel(" USER NAME");
        JTextField userNameText = new JTextField(v.getUsername());
        userNameText.setMinimumSize(new Dimension(200,30));
        userNameText.setPreferredSize(new Dimension(200, 30));
        
        JLabel passwordLbl = new JLabel(" PASSWORD");
        JTextField passwordText = new JTextField(v.getPassword());
        passwordText.setMinimumSize(new Dimension(200,30));
        passwordText.setPreferredSize(new Dimension(200,30));
        
        JLabel phoneNumberLbl = new JLabel(" PHONE NUMBER");
        JTextField phoneNumberText = new JTextField(v.getPhoneNumber());
        phoneNumberText.setMinimumSize(new Dimension(200,30));
        phoneNumberText.setPreferredSize(new Dimension(200,30));
        
        JLabel emailLbl = new JLabel(" EMAIL ");
        JTextField emailText = new JTextField(v.getEmail());
        emailText.setMinimumSize(new Dimension(200,30));
        emailText.setPreferredSize(new Dimension(200,30));
        
        JLabel cashLbl = new JLabel(" CASH");
        JTextField cashText = new JTextField(v.getCash());
        cashText.setMinimumSize(new Dimension(200,30));
        cashText.setPreferredSize(new Dimension(200,30));
        
        JPanel btnPanel = new JPanel();
        
        JButton btnEdit = new JButton("EDIT");
        JButton btnLogout = new JButton("LOGOUT");
        
        btnPanel.add(btnEdit);
        btnPanel.add(btnLogout);
        
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
        add(cashLbl);
        add(cashText);
        
        add(btnPanel);
        
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0){
                    firstNameText.setEditable(true);
                    String newName = firstNameText.getText();
                    firstNameText.setText(newName);
                    
                    lastNameText.setEditable(true);
                    String newLastName = lastNameText.getText();
                    lastNameText.setText(newLastName);
                    
                    userNameText.setEditable(true);
                    String newUsername = userNameText.getText();
                    userNameText.setText(newUsername);
                    
                    passwordText.setEditable(true);
                    String newPassword = passwordText.getText();
                    passwordText.setText(newPassword);
                    
                    phoneNumberText.setEditable(true);
                    String newPhone = phoneNumberText.getText();
                    phoneNumberText.setText(newPhone);
                    
                    emailText.setEditable(true);
                    String newEmail = emailText.getText();
                    emailText.setText(newEmail);
                    
                    cashText.setEditable(false);
                    
                    btnEdit.setText("SAVE");
                }
                if(flag == 1){
                    firstNameText.setEditable(false);
                    lastNameText.setEditable(false);
                    userNameText.setEditable(false);
                    passwordText.setEditable(false);
                    phoneNumberText.setEditable(false);
                    emailText.setEditable(false);
                    cashText.setEditable(false);
                    
                    btnEdit.setText("Edit");
                }
                if(btnEdit.getText() == "SAVE")
                    flag=1;
                else flag=0;
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
