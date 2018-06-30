import javax.security.auth.login.LoginContext;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class SignUpFrame extends JFrame{
    
    public SignUpFrame(){
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();      
        this.setLocation(dim.width/3, dim.height/12);
        
        setMinimumSize(new Dimension(400, 530));
        setPreferredSize(new Dimension(400, 530));
        setResizable(false);
        
        JPanel centerPanel = new JPanel();
        add(centerPanel,BorderLayout.CENTER);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(100, 550));
        rightPanel.setPreferredSize(new Dimension(100, 550));
        add(rightPanel,BorderLayout.EAST);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setMinimumSize(new Dimension(100, 550));
        leftPanel.setPreferredSize(new Dimension(100, 550));
        add(leftPanel,BorderLayout.WEST);
        
        JPanel downlPanel = new JPanel();
        downlPanel.setMinimumSize(new Dimension(400, 50));
        downlPanel.setPreferredSize(new Dimension(400, 50));
        add(downlPanel,BorderLayout.SOUTH);
        
        final JTextField nameText = new JTextField();
        nameText.setMinimumSize(new Dimension(180, 50));
        nameText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(nameText,BorderLayout.NORTH);
        
        final JTextField lnameText = new JTextField();
        lnameText.setMinimumSize(new Dimension(180, 50));
        lnameText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(lnameText,BorderLayout.CENTER);
        
        final JTextField userText = new JTextField();
        userText.setMinimumSize(new Dimension(180, 50));
        userText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(userText,BorderLayout.CENTER);
        
        final JTextField passText = new JTextField();
        passText.setMinimumSize(new Dimension(180, 50));
        passText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(passText,BorderLayout.CENTER);
        
        final JTextField phoneText = new JTextField();
        phoneText.setMinimumSize(new Dimension(180, 50));
        phoneText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(phoneText,BorderLayout.CENTER);
        
        final JTextField emailText = new JTextField();
        emailText.setMinimumSize(new Dimension(180, 50));
        emailText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(emailText,BorderLayout.CENTER);
        
        final JTextField cashText = new JTextField();
        cashText.setMinimumSize(new Dimension(180, 50));
        cashText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(cashText,BorderLayout.CENTER);
        
        JLabel nameLbl = new JLabel("NAME");
        final EmptyBorder nameBorder = new EmptyBorder(20, 30, 0, 0);
        nameLbl.setBorder(nameBorder);
        
        JLabel lnameLbl = new JLabel("LAST NAME");
        final EmptyBorder lnameBorder = new EmptyBorder(30, 30, 0, 0);
        lnameLbl.setBorder(lnameBorder);
        
        JLabel userLbl = new JLabel("USERNAME");
        final EmptyBorder userBorder = new EmptyBorder(30, 30, 0, 0);
        userLbl.setBorder(userBorder);
        
        JLabel passLbl = new JLabel("PASSWORD");
        final EmptyBorder passBorder = new EmptyBorder(30, 30, 0, 0);
        passLbl.setBorder(passBorder);
        
        JLabel phoneLbl = new JLabel("PHONE NUMBER");
        final EmptyBorder phoneBorder = new EmptyBorder(35, 8 ,0, 0);
        phoneLbl.setBorder(phoneBorder);
        
        JLabel emailLbl = new JLabel("EMAIL");
        final EmptyBorder emailBorder = new EmptyBorder(40, 30, 0, 0);
        emailLbl.setBorder(emailBorder);
        
        JLabel cashLbl = new JLabel("CASH");
        final EmptyBorder cashBorder = new EmptyBorder(40, 30, 0, 0);
        cashLbl.setBorder(cashBorder);
        
        leftPanel.add(nameLbl);
        leftPanel.add(lnameLbl);
        leftPanel.add(userLbl);
        leftPanel.add(passLbl);
        leftPanel.add(phoneLbl);
        leftPanel.add(emailLbl);
        leftPanel.add(cashLbl);
        
        JPanel cDownPanel = new JPanel();
        cDownPanel.setMinimumSize(new Dimension(150, 80));
        cDownPanel.setPreferredSize(new Dimension(150, 80));
        centerPanel.add(cDownPanel);
        
        JButton btnSignUp = new JButton("SIGN UP");
        cDownPanel.add(btnSignUp,BorderLayout.CENTER);
        
        btnSignUp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name =nameText.getText();
                String lname =lnameText.getText();
                String username =userText.getText();
                String password =passText.getText();
                String phoneNumber =phoneText.getText();
                String email =emailText.getText();
                String cash =cashText.getText();
                
                Visitor v = new Visitor(name, lname,username, password, phoneNumber, email, cash);
                
                try{
                    
                    String line;
                    FileWriter fw = new FileWriter("Visitor.txt",true);
                    BufferedWriter bw  = new BufferedWriter(fw);
                    
                    line = name+":" + lname+":" + username+":" + password+":" + phoneNumber+":" + email+":" + cash ;
            
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                    bw.close();
        
                    Visitor vis = new Visitor(name, lname, username, password, phoneNumber, email, cash);
                    
                    setVisible(false);
                    VisitorFrame visitorframe = new VisitorFrame(vis);
                    visitorframe.setVisible(true);
                    
                }catch(Exception ex){
                    
                }

            }
        });
        
    }
    
}
