import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisitorTicketPanel extends JPanel {
    
    public VisitorTicketPanel() {
        
        setMinimumSize(new Dimension(500, 900));
        setPreferredSize(new Dimension(500, 900));
        
        GridLayout grid = new GridLayout(7, 1);
        setLayout(grid);
        
        JLabel numberLbl = new JLabel(" Number");
        JTextField numberText = new JTextField();
        numberText.setMinimumSize(new Dimension(50,20));
        numberText.setPreferredSize(new Dimension(50, 20));
        
        JLabel dateLbl = new JLabel(" Date");
        JTextField dateText = new JTextField();
        dateText.setMinimumSize(new Dimension(50,20));
        dateText.setPreferredSize(new Dimension(50, 20));
        
        JLabel departmentLbl = new JLabel(" Department");
        JTextField departmentText = new JTextField();
        dateText.setMinimumSize(new Dimension(50,20));
        dateText.setPreferredSize(new Dimension(50, 20));
        
        JPanel btnPanel = new JPanel();
        
        JButton btnLogout = new JButton("LOGOUT");
        JButton btnSubmit = new JButton("SUBMIT");
        
        btnPanel.add(btnLogout);
        btnPanel.add(btnSubmit);
        
        add(numberLbl);
        add(numberText);
        add(dateLbl);
        add(dateText);
        add(departmentLbl);
        add(departmentText);
        
        add(btnPanel);
        
        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String number = numberText.getText();
                String date = dateText.getText();
                String department = departmentText.getText();
                
                
                
            }
        });
        
        btnLogout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                EntranceFrame entranceframe = new EntranceFrame();
                entranceframe.setVisible(true);
                
            }
        });
        
    }
    
}
