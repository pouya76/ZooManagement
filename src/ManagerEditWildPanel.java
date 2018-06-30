import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerEditWildPanel extends JPanel {
    
    public ManagerEditWildPanel() {
        
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
        
        JLabel homeLbl = new JLabel(" HOME");
        JTextField homeText = new JTextField();
        homeText.setMinimumSize(new Dimension(200,30));
        homeText.setPreferredSize(new Dimension(200,30));

        JPanel btnPanel = new JPanel();
        
        JButton btnEditAndSave = new JButton("EDIT AND SAVE");
        JButton btnLogout = new JButton("LOGOUT");
        
        btnPanel.add(btnEditAndSave);
        btnPanel.add(btnLogout);
        
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
        add(homeLbl);
        add(homeText);
        
        add(btnPanel);
        
        
        /*btnEditAndSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String name = nameText.getText();
                String sex = sexText.getText();
                String nationality = nationalityText.getText();
                String nationalID = nationalIDText.getText();
                String insurance = insuranceText.getText();
                String food = foodText.getText();
                String department = departmentText.getText();
                String home = homeText.getText();
                
                for(int i=0 ; i<Wild.wildList.size() ; i++) {
                    
                    if(name.equals(Wild.wildList.get(i).getName())) {
                        
                        Wild.wildList.get(i).setSex(sex);
                        Wild.wildList.get(i).setNationality(nationality);
                        Wild.wildList.get(i).setNational_id(nationalID);
                        Wild.wildList.get(i).setInsurance(insurance);
                        Wild.wildList.get(i).setFood(food);
                        Wild.wildList.get(i).setDepartment_of_living(department);
                        Wild.wildList.get(i).setHome(home);
                        
                    }
                    
                }
                
            }
        });
        */
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
