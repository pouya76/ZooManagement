import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ZookeperEditInfoPanel extends JPanel {
    
    int flag=0;
    
    static String zookeperdetails ;
    
    public ZookeperEditInfoPanel(Zookeper z){
        
        zookeperdetails = z.getName()+":"+z.getLastname()+":"+z.getUsername()+":"+z.getPassword()+":"+z.getPhoneNumber()+":"+z.getAddress()+":"+z.getEmail()+":"+z.getDepartment()+":"+z.getAddress()+":"+z.getSalary();
        
        setMinimumSize(new Dimension(600, 900));
        setPreferredSize(new Dimension(600, 900));
        BoxLayout centerLayout = new BoxLayout(this,BoxLayout.Y_AXIS);
        setLayout(centerLayout);
        
        int i=0;
        
        final JLabel firstName = new JLabel(" first name :");
        final JTextField firstNameText = new JTextField(z.getName());
        firstNameText.setMinimumSize(new Dimension(50,20));
        firstNameText.setPreferredSize(new Dimension(50, 20));

        
        final JLabel lastName = new JLabel(" last name :");
        final JTextField lastNameText = new JTextField(z.getLastname());
        lastNameText.setMinimumSize(new Dimension(200,30));
        lastNameText.setPreferredSize(new Dimension(200, 30));

        
        final JLabel username = new JLabel(" username :");
        final JTextField userText = new JTextField(z.getUsername());
        userText.setMinimumSize(new Dimension(200,30));
        userText.setPreferredSize(new Dimension(200, 30));

        
        final JLabel password = new JLabel(" password :");
        final JTextField passText = new JTextField(z.getPassword());
        passText.setMinimumSize(new Dimension(200,30));
        passText.setPreferredSize(new Dimension(200,30));

        
        final JLabel phoneNumber = new JLabel(" phone number :");
        final JTextField phoneText = new JTextField(z.getPhoneNumber());
        phoneText.setMinimumSize(new Dimension(200,30));
        phoneText.setPreferredSize(new Dimension(200,30));

        
        final JLabel Email = new JLabel(" Email :");
        final JTextField emailText = new JTextField(z.getEmail());
        emailText.setMinimumSize(new Dimension(200,30));
        emailText.setPreferredSize(new Dimension(200,30));
        
        
        final JLabel Department = new JLabel(" department :");
        final JTextField departmentText = new JTextField(z.getDepartment());
        departmentText.setMinimumSize(new Dimension(200,30));
        departmentText.setPreferredSize(new Dimension(200,30));
        
        
        final JLabel Address = new JLabel(" address :");
        final JTextField AddressText = new JTextField(z.getAddress());
        AddressText.setMinimumSize(new Dimension(200,30));
        AddressText.setPreferredSize(new Dimension(200,30));
        
        
        final JLabel Salary = new JLabel(" salary :");
        final JTextField salaryText = new JTextField(z.getSalary());
        salaryText.setMinimumSize(new Dimension(200,30));
        salaryText.setPreferredSize(new Dimension(200,30));
        
        
        add(firstName);
        add(firstNameText);
        add(lastName);
        add(lastNameText);
        add(username);
        add(userText);
        add(password);
        add(passText);
        add(phoneNumber);
        add(phoneText);
        add(Address);
        add(AddressText);
        add(Email);
        add(emailText);
        add(Department);
        add(departmentText);
        add(Salary);
        add(salaryText);
 
        JButton btnEdit = new JButton("Edit");
        JButton btnlogout = new JButton("LOG OUT");

        JPanel btnPanel = new JPanel();
        btnPanel.setMinimumSize(new Dimension(400,50));
        btnPanel.setPreferredSize(new Dimension(400, 50));

        add(btnPanel);
        btnPanel.add(btnlogout);
        btnPanel.add(btnEdit);

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String newName=z.getName(), newLastName=z.getLastname(), newUsername=z.getUsername(), newPassword=z.getPassword(), newPhone=z.getPhoneNumber(), newAddress=z.getAddress(), newEmail=z.getEmail(), newDepartment=z.getDepartment(), salary=z.getSalary();
                
                if(flag == 0){
                    firstNameText.setEditable(true);
                    newName = firstNameText.getText();
                    z.setName(newName);
                    firstNameText.setText(newName);
                    
                    lastNameText.setEditable(true);
                    newLastName = lastNameText.getText();
                    z.setLastname(newLastName);
                    lastNameText.setText(newLastName);
                    
                    userText.setEditable(true);
                    newUsername = userText.getText();
                    z.setUsername(newUsername);
                    userText.setText(newUsername);
                    
                    passText.setEditable(true);
                    newPassword = passText.getText();
                    z.setPassword(newPassword);
                    passText.setText(newPassword);
                    
                    phoneText.setEditable(true);
                    newPhone = phoneText.getText();
                    z.setPhoneNumber(newPhone);
                    phoneText.setText(newPhone);
                    
                    AddressText.setEditable(true);
                    newAddress = AddressText.getText();
                    z.setAddress(newAddress);
                    AddressText.setText(newAddress);
                    
                    emailText.setEditable(true);
                    newEmail = emailText.getText();
                    z.setEmail(newEmail);
                    emailText.setText(newEmail);
                    
                    departmentText.setEditable(true);
                    newDepartment = departmentText.getText();
                    z.setDepartment(newDepartment);
                    departmentText.setText(newDepartment);
                    
                    salaryText.setEditable(false);
                    
                    btnEdit.setText("SAVE");
                }
                if(flag == 1){
                    firstNameText.setEditable(false);
                    lastNameText.setEditable(false);
                    userText.setEditable(false);
                    passText.setEditable(false);
                    phoneText.setEditable(false);
                    AddressText.setEditable(false);
                    emailText.setEditable(false);
                    departmentText.setEditable(false);
                    salaryText.setEditable(false);

                    try {
                        
                        /********** store new details ************/
                        FileWriter fw=new FileWriter("zookeperdetails.txt");
                        BufferedWriter bw=new BufferedWriter(fw);
                        bw.write(newName+":"+newLastName+":"+newUsername+":"+newPassword+":"+newPhone+":"+newAddress+":"+newEmail+":"+salary);
                        bw.flush();
                        bw.close();
                        
                        /********** delete old details ************/
                        try {
                        FileReader fr1=new FileReader("Zookeper.txt");
                        FileReader fr2=new FileReader("Zookeper.txt");
                        BufferedReader br1=new BufferedReader(fr1);
                        BufferedReader br2=new BufferedReader(fr2);
                        FileWriter fw2=new FileWriter("zook.txt");
                        BufferedWriter bw2=new BufferedWriter(fw2);
                        String tmp=br1.readLine();
            
                        while(tmp!=null){
                
                        if(zookeperdetails.equals(tmp)){
                            break;
                        }
                        tmp=br1.readLine();
                        }
                        String asli=br2.readLine();
                        while(asli!=null && !(asli.equals(tmp))){
                            bw2.write(asli);
                            bw2.newLine();
                            bw2.flush();
                            asli=br2.readLine();
                        }
                        bw2.flush();
                        asli=br2.readLine();
                        while(asli!=null){
                            bw2.write(asli);
                            bw2.newLine();
                            bw2.flush();
                            asli=br2.readLine();
                        }
                        bw2.flush();
                        fw2.close();
                        FileReader fr4=new FileReader("zook.txt");
                        BufferedReader bf=new BufferedReader(fr4);
                        FileWriter fw5=new FileWriter("Zookeper.txt");
                        BufferedWriter bw5=new BufferedWriter(fw5);
                        String h;
                        
                        do{
                            h=bf.readLine();
                            if (h!=null) {
                                bw5.write(h);
                            bw5.newLine();
                            bw5.flush();
                            }
                        }
                        while(h!=null);
                        fw5.close();
                        } catch (FileNotFoundException ex) {
                        } catch (IOException ex) {
                        }
            
                        FileReader fr=new FileReader("zookeperdetails.txt");
                        BufferedReader br=new BufferedReader(fr);
                        FileWriter fw1=new FileWriter("Zookeper.txt",true);
                        BufferedWriter bw1=new BufferedWriter(fw1);
                        bw1.write(br.readLine());
                        bw1.flush();
                        bw1.close();
            
                        zookeperdetails = z.getName()+":"+z.getLastname()+":"+z.getUsername()+":"+z.getPassword()+":"+z.getPhoneNumber()+":"+z.getAddress()+":"+z.getEmail()+":"+z.getDepartment()+":"+z.getAddress()+":"+z.getSalary();
                            
                        System.out.println("zookeper profile edited successfully !");
            
                    } catch (IOException ex) {
                    }
                    btnEdit.setText("Edit");
                }
                if(btnEdit.getText() == "SAVE")
                    flag=1;
                else flag=0;
            }
        });
         
        btnlogout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                EntranceFrame frame = new EntranceFrame();
                frame.setVisible(true);

            }
        });
  
    }
    
}
