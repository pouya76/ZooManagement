import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisitorCommentPanel extends JPanel {
    
    public VisitorCommentPanel() {
        
        setMinimumSize(new Dimension(500, 900));
        setPreferredSize(new Dimension(500, 900));
        
        GridLayout grid = new GridLayout(2, 1);
        setLayout(grid);
        
        JLabel commentLbl = new JLabel(" Comment");
        JTextField commentText = new JTextField();
        commentText.setMinimumSize(new Dimension(50,20));
        commentText.setPreferredSize(new Dimension(50, 20));
        
        JPanel btnPanel = new JPanel();
        
        JButton btnLogout = new JButton("LOGOUT");
        JButton btnSubmit = new JButton("SUBMIT");
        
        btnPanel.add(btnLogout);
        btnPanel.add(btnSubmit);
        
        add(commentLbl);
        add(commentText);

        
        add(btnPanel);
        
        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String comment = commentText.getText();
                
                
                
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
