import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisitorRaiseCreditPanel extends JPanel {
    
    public VisitorRaiseCreditPanel() {
        
        setMinimumSize(new Dimension(500, 900));
        setPreferredSize(new Dimension(500, 900));
        
        GridLayout grid = new GridLayout(3, 1);
        setLayout(grid);
        
        JLabel creditLbl = new JLabel(" Credit");
        JTextField creditText = new JTextField();
        creditText.setMinimumSize(new Dimension(50,20));
        creditText.setPreferredSize(new Dimension(50, 20));
        
        JPanel btnPanel = new JPanel();
        
        JButton btnLogout = new JButton("LOGOUT");
        JButton btnSubmit = new JButton("SUBMIT");
        
        btnPanel.add(btnLogout);
        btnPanel.add(btnSubmit);
        
        add(creditLbl);
        add(creditText);
        
        add(btnPanel);
        
        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String credit = creditText.getText();
                
                if(Integer.parseInt(credit)>=0) {
                    
                    for(Visitor v : Visitor.visitorList) {
                        
                        int cr = Integer.parseInt(credit) + Integer.parseInt(v.getCash()) ;
                        
                        String newCash = String.valueOf(cr);
                        
                        v.setCash(newCash);
                        
                    }
  
                }
                
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
