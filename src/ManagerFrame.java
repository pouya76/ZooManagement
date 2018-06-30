import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerFrame extends JFrame {
    
    public ManagerAddZookeperPanel hireZookper;
    public ManagerRemoveZookeperPanel fireZookeper;
    public ManagerEditZookeperPanel editZookeper;
    public ManagerShowZookepersPanel showZookeper;
    public ManagerEditAccountPanel editAccount;
    public ManagerAddBirdPanel addBird;
    public ManagerAddAquaticPanel addAquatic;
    public ManagerAddWildPanel addWild;
    public ManagerRemoveBirdPanel removeBird;
    public ManagerRemoveAquaticPanel removeAquatic;
    public ManagerRemoveWildPanel removeWild;
    public ManagerEditBIrdPanel editBird;
    public ManagerEditAquaticPanel editAquatic;
    public ManagerAddWildPanel editWild;
    
    
    public ManagerFrame(Manager m) {
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();      
        this.setLocation(dim.width/3, dim.height/12);
        
        hireZookper = new ManagerAddZookeperPanel();
        fireZookeper = new ManagerRemoveZookeperPanel();
        editZookeper = new ManagerEditZookeperPanel();
        showZookeper = new ManagerShowZookepersPanel();
        editAccount = new ManagerEditAccountPanel(m);
        addBird = new ManagerAddBirdPanel();
        addAquatic = new ManagerAddAquaticPanel();
        addWild = new ManagerAddWildPanel();
        removeBird = new ManagerRemoveBirdPanel();
        removeAquatic = new ManagerRemoveAquaticPanel();
        removeWild = new ManagerRemoveWildPanel();
        editBird = new ManagerEditBIrdPanel();
        editAquatic = new ManagerEditAquaticPanel();
        editWild = new ManagerAddWildPanel();
        
        setMinimumSize(new Dimension(700, 900));
        setPreferredSize(new Dimension(700, 900));
        setResizable(false);
        
        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(700, 200));
        upPanel.setPreferredSize(new Dimension(700, 200));
        add(upPanel, BorderLayout.NORTH);
        
        final JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        
        centerPanel.add(hireZookper);
        centerPanel.add(fireZookeper);
        centerPanel.add(editZookeper);
        centerPanel.add(editAccount);
        centerPanel.add(addBird);
        centerPanel.add(addAquatic);
        centerPanel.add(addWild);
        centerPanel.add(removeBird);
        centerPanel.add(removeAquatic);
        centerPanel.add(removeWild);
        centerPanel.add(editBird);
        centerPanel.add(editAquatic);
        centerPanel.add(editWild);
        
        JButton btn1 = new JButton("HIRE ZOOKEPER");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn1);
        
        JButton btn2 = new JButton("FIRE ZOOKEPER");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn2);
        
        JButton btn3 = new JButton("EDIT ZOOKEPER");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn3);
        
        JButton btn4 = new JButton("Show ZOOKEPERS");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn4);
        
        JButton btn5 = new JButton("EDIT ACCOUNT");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn5);
        
        JButton btn6 = new JButton("ADD BIRD");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn6);
        
        JButton btn7 = new JButton("ADD AQUATIC");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn7);
        
        JButton btn8 = new JButton("ADD WILD");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn8);
        
        JButton btn9 = new JButton("REMOVE BIRD");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn9);
        
        JButton btn10 = new JButton("REMOVE AQUATIC");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn10);
        
        JButton btn11 = new JButton("REMOVE WILD");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn11);
        
        JButton btn12 = new JButton("EDIT BIRD");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn12);
        
        JButton btn13 = new JButton("EDIT AQUATIC");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn13);
        
        JButton btn14 = new JButton("EDIT WILD");
        btn1.setMinimumSize(new Dimension(120, 80));
        btn1.setPreferredSize(new Dimension(120, 80));
        upPanel.add(btn14);
        
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(true);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(true);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(true);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(true);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(true);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(true);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(true);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(true);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(true);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(true);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(true);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn12.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(true);
                editAquatic.setVisible(false);
                editWild.setVisible(false);
                
            }
        });
        
        btn13.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(true);
                editWild.setVisible(false);
                
            }
        });
        
        btn14.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                hireZookper.setVisible(false);
                fireZookeper.setVisible(false);
                editZookeper.setVisible(false);
                showZookeper.setVisible(false);
                editAccount.setVisible(false);
                addBird.setVisible(false);
                addAquatic.setVisible(false);
                addWild.setVisible(false);
                removeBird.setVisible(false);
                removeAquatic.setVisible(false);
                removeWild.setVisible(false);
                editBird.setVisible(false);
                editAquatic.setVisible(false);
                editWild.setVisible(true);
                
            }
        });
        
    }
    
}
