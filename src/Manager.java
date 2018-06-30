import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Manager extends Person implements Showable {
    
    static ArrayList<Manager> managerList = new ArrayList<Manager>();
    
    protected String Address;
    protected String Salary;
    
    public Manager(String name, String lastname, String username, String password, String phoneNumber, String email, String Address, String Salary) {
        super(name, lastname, username, password, phoneNumber, email);
        this.Address = Address;
        this.Salary = Salary;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    @Override
    public void show() {
        
        for(int i=0 ; i<managerList.size() ; i++) {
            
            JOptionPane.showMessageDialog(null, i+" ) "+ managerList.get(i).getName() + "\t" + managerList.get(i).getLastname());
            
        }
        
    }
    
    public static void write() throws IOException {
        
        String line;
        
        FileWriter fw = new FileWriter("Manager.txt");
        BufferedWriter bw  = new BufferedWriter(fw);
        
        for(Manager m : managerList) {
            
            line = m.getName() + m.getLastname() + m.getUsername() + m.getPassword() + m.getPhoneNumber() + m.getEmail() + m.getAddress() + m.getSalary();
            
            bw.write(line);
            bw.newLine();
            
        }
        
        bw.flush();
        bw.close();
        
        
    }
    
    public static void read() throws Exception {
        
        FileReader fr = new FileReader("Manager.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line , str[];
        
        while( (line = br.readLine()) != null ) {
            
            str = line.split("\t");
            Manager m = new Manager(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]);
            managerList.add(m);
            
        }
        
        br.close();
        
        
    }

    public static void addManager(String name, String lastname, String username, String password, String phonenumber, String email, String address, String salary ) {
        
        Manager m = new Manager(name, lastname, username, password, phonenumber, email, address, salary);
        
        managerList.add(m);
        
    }
    
    public static void removeManager(String name) {
        
        try{
            
            for(Manager temp : managerList) {
                
                if(temp.getName().equals(name)) {
                    
                    managerList.remove(temp);
                    
                    JOptionPane.showMessageDialog(null, "Manager" + temp.getName() + " has been deleted ");
                    
                }
                
            }
            
        } catch(Exception e){  JOptionPane.showMessageDialog(null, "delete error!");}
        
    }

}
