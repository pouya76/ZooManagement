import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerEditAquaticPanel extends JPanel{
    
    public ManagerEditAquaticPanel() {
        
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
        add(carnivorousLbl);
        add(carnivorousText);
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
                String carnivorous = carnivorousText.getText();
                
                for(int i=0 ; i<Aquatic.aquaticList.size() ; i++) {
                    
                    if(name.equals(Aquatic.aquaticList.get(i).getName())) {
                        
                        Aquatic.aquaticList.get(i).setSex(sex);
                        Aquatic.aquaticList.get(i).setNationality(nationality);
                        Aquatic.aquaticList.get(i).setNational_id(nationalID);
                        Aquatic.aquaticList.get(i).setInsurance(insurance);
                        Aquatic.aquaticList.get(i).setFood(food);
                        Aquatic.aquaticList.get(i).setDepartment_of_living(department);
                        Aquatic.aquaticList.get(i).setCarnivorous(true);
                        
                    } else {
                        
                        JOptionPane.showMessageDialog(null, "Wrong name !");
                        
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
