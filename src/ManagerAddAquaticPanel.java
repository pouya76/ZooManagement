import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerAddAquaticPanel extends JPanel {
    
    public ManagerAddAquaticPanel() {
        
        setMinimumSize(new Dimension(700, 500));
        setPreferredSize(new Dimension(700, 500));
        
        BoxLayout centerLayout = new BoxLayout(this,BoxLayout.Y_AXIS);
        setLayout(centerLayout);
        
        JLabel nameLbl = new JLabel(" NAME");
        JTextField nameText = new JTextField();
        nameText.setMinimumSize(new Dimension(50,20));
        nameText.setPreferredSize(new Dimension(50, 20));
        
        JLabel sexLbl = new JLabel(" SEX");
        JTextField sexText = new JTextField();
        sexText.setMinimumSize(new Dimension(200,30));
        sexText.setPreferredSize(new Dimension(200, 30));
        
        JLabel nationalityLbl = new JLabel(" NATIONALITY");
        JTextField nationalityText = new JTextField();
        nationalityText.setMinimumSize(new Dimension(200,30));
        nationalityText.setPreferredSize(new Dimension(200, 30));
        
        JLabel nationalIDLbl = new JLabel(" NATIONAL-ID");
        JTextField nationalIDText = new JTextField();
        nationalIDText.setMinimumSize(new Dimension(200,30));
        nationalIDText.setPreferredSize(new Dimension(200,30));
        
        JLabel insuranceLbl = new JLabel(" INSURANCE");
        JTextField insuranceText = new JTextField();
        insuranceText.setMinimumSize(new Dimension(200,30));
        insuranceText.setPreferredSize(new Dimension(200,30));
        
        JLabel foodLbl = new JLabel(" FOOD");
        JTextField foodText = new JTextField();
        foodText.setMinimumSize(new Dimension(200,30));
        foodText.setPreferredSize(new Dimension(200,30));
        
        JLabel departmentLbl = new JLabel(" DEPARTMENT");
        JTextField departmentText = new JTextField();
        departmentText.setMinimumSize(new Dimension(200,30));
        departmentText.setPreferredSize(new Dimension(200,30));
        
        JLabel carnivorousLbl = new JLabel(" CARNIVOROUS");
        JTextField carnivorousText = new JTextField();
        carnivorousText.setMinimumSize(new Dimension(200,30));
        carnivorousText.setPreferredSize(new Dimension(200,30));

        add(nameLbl);
        add(nameText);
        add(sexLbl);
        add(sexText);
        add(nationalityLbl);
        add(nationalityText);
        add(nationalIDLbl);
        add(nationalIDText);
        add(insuranceLbl);
        add(insuranceText);
        add(foodLbl);
        add(foodText);
        add(departmentLbl);
        add(departmentText);
        add(carnivorousLbl);
        add(carnivorousText);
        
        JPanel btnPanel = new JPanel();
        
        JButton btnAdd = new JButton("ADD");
        JButton btnLogout = new JButton("LOGOUT");
        
        btnPanel.add(btnAdd);
        btnPanel.add(btnLogout);
        add(btnPanel);
        
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                try{
                    
                    String wild = carnivorousText.getText();
                    Boolean wildness = false;
                    if(wild.equals("yes") || wild.equals("y") || wild.equals("YES") || wild.equals("Y") || wild.equals("T") || wild.equals("true") || wild.equals("Yes") || wild.equals("True")) {
                        wildness=true; 
                    }
                
                    Aquatic aqua = new Aquatic(nameText.getText(), sexText.getText(), nationalityText.getText(), nationalIDText.getText(), insuranceText.getText(), foodText.getText(), departmentText.getText(), wildness);
                    
                        String name=nameText.getText();
                        String sex = sexText.getText();
                        String nat=nationalityText.getText();
                        String natid =nationalIDText.getText();
                        String ins=insuranceText.getText();
                        String food = foodText.getText();
                        String dep= departmentText.getText();
                 
                    if (!(name.equals("")) && !(sex.equals("")) && !(nat.equals("")) && !(natid.equals("")) && !(ins.equals("")) && !(food.equals("")) && !(dep.equals(""))) {
                        aqua.addAquatic(nameText.getText(), sexText.getText(), nationalityText.getText(), nationalIDText.getText(), insuranceText.getText(), foodText.getText(), departmentText.getText(), wildness);
                        System.out.println("aquatic added successfully !");
                    }
                    else{
                    System.out.println("----complete all fields---");
                    }
                
                }catch(Exception ee) {
                    
                    
                    
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
