import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class SuperAdminFrame extends JFrame {
    
    public SuperAdminAddManagerPanel addManager;
    public SuperAdminRemoveManagerPanel removeManager;
    public SuperAdminEditManagerPanel editManager;
    public SuperAdminShowManagersPanel showPanel;
    
    
    public SuperAdminFrame() {
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();      
        this.setLocation(dim.width/3, dim.height/12);
        
        addManager = new SuperAdminAddManagerPanel();
        removeManager = new SuperAdminRemoveManagerPanel();
        editManager = new SuperAdminEditManagerPanel();
        showPanel = new SuperAdminShowManagersPanel();
        
        
        setMinimumSize(new Dimension(700, 900));
        setPreferredSize(new Dimension(700, 900));
        setResizable(false);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(200, 900));
        rightPanel.setPreferredSize(new Dimension(200, 900));
        add(rightPanel, BorderLayout.EAST);
        
        final JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        
        centerPanel.add(addManager);
        centerPanel.add(removeManager);
        centerPanel.add(editManager);
        centerPanel.add(showPanel);
        
        
        JButton btn1 = new JButton("ADD MANAGER");
        btn1.setMinimumSize(new Dimension(120, 100));
        btn1.setPreferredSize(new Dimension(120, 100));
        rightPanel.add(btn1);
        
        JButton btn2 = new JButton("REMOVE MANAGER");
        btn2.setMinimumSize(new Dimension(120, 100));
        btn2.setPreferredSize(new Dimension(120, 100));
        rightPanel.add(btn2);
        
        JButton btn3 = new JButton("EDIT MANAGER");
        btn3.setMinimumSize(new Dimension(120, 100));
        btn3.setPreferredSize(new Dimension(120, 100));
        rightPanel.add(btn3);
        
        JButton btn4 = new JButton("SHOW MANAGERS");
        btn4.setMinimumSize(new Dimension(120, 100));
        btn4.setPreferredSize(new Dimension(120, 100));
        rightPanel.add(btn4);
        
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                addManager.setVisible(true);
                removeManager.setVisible(false);
                editManager.setVisible(false);
                showPanel.setVisible(false);
                
                
            }
        });
        
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                addManager.setVisible(false);
                removeManager.setVisible(true);
                editManager.setVisible(false);
                showPanel.setVisible(false);
                
            }
        });
        
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                addManager.setVisible(false);
                removeManager.setVisible(false);
                editManager.setVisible(true);
                showPanel.setVisible(false);
                
            }
        });
        
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                addManager.setVisible(false);
                removeManager.setVisible(false);
                editManager.setVisible(false);
                showPanel.setVisible(true);
                
            }
        });

    }
    
}
