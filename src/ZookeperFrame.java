import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZookeperFrame extends JFrame {
    
    public ZookeperEditInfoPanel editInfo;
    
    public ZookeperFrame(Zookeper z){
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();      
        this.setLocation(dim.width/3, dim.height/12);
         
        editInfo = new ZookeperEditInfoPanel(z);
        
        setMinimumSize(new Dimension(600,1000));
        setPreferredSize(new Dimension(600, 1000));
        setResizable(false);
        
        final JPanel centerPanel = new JPanel();
        add(centerPanel,BorderLayout.CENTER);
        
        centerPanel.add(editInfo);
        
        
        
    }
    
}
