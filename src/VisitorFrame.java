import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisitorFrame extends JFrame {
    
    public VisitorEditAccountPanel editAccount;
    public VisitorRaiseCreditPanel raiseCredit;
    public VisitorTicketPanel ticket;
    public VisitorCommentPanel comment;
    
    public VisitorFrame(Visitor v) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();      
        this.setLocation(dim.width/3, dim.height/12);
        
        editAccount = new VisitorEditAccountPanel(v);
        raiseCredit = new VisitorRaiseCreditPanel();
        ticket = new VisitorTicketPanel();
        comment = new VisitorCommentPanel();
        
        setMinimumSize(new Dimension(700, 900));
        setPreferredSize(new Dimension(700, 900));
        setResizable(false);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(200, 900));
        rightPanel.setPreferredSize(new Dimension(200, 900));
        add(rightPanel, BorderLayout.EAST);
        
        final JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        
        centerPanel.add(editAccount);
        centerPanel.add(raiseCredit);
        centerPanel.add(ticket);
        centerPanel.add(comment);
        
        JButton btn1 = new JButton("EDIT ACCOUNT");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        rightPanel.add(btn1);
        
        JButton btn2 = new JButton("RAISE CREDIT");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        rightPanel.add(btn2);
        
        JButton btn3 = new JButton("TICKET");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        rightPanel.add(btn3);
        
        JButton btn4 = new JButton("COMMENT");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        rightPanel.add(btn4);
        
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                editAccount.setVisible(true);
                raiseCredit.setVisible(false);
                ticket.setVisible(false);
                comment.setVisible(false);
                
            }
        });
        
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                editAccount.setVisible(false);
                raiseCredit.setVisible(true);
                ticket.setVisible(false);
                comment.setVisible(false);
                
            }
        });
        
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                editAccount.setVisible(false);
                raiseCredit.setVisible(false);
                ticket.setVisible(true);
                comment.setVisible(false);
                
            }
        });
        
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                editAccount.setVisible(false);
                raiseCredit.setVisible(false);
                ticket.setVisible(false);
                comment.setVisible(true);
                
            }
        });
        
    }
    
}
