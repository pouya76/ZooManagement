import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Zookeper extends Person implements Showable{
    
    static ArrayList<Zookeper> zookeeperList = new ArrayList<Zookeper>();
    
    private String Department;
    private String Address;
    private String Salary;

    public Zookeper(String name, String lastname, String username, String password, String phoneNumber, String email, String Department, String Address, String Salary) {
        super(name, lastname, username, password, phoneNumber, email);
        this.Department = Department;
        this.Address = Address;
        this.Salary = Salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
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
        
        for(int i=0 ; i<zookeeperList.size() ; i++) {
            
            JOptionPane.showMessageDialog(null, i+" ) "+ zookeeperList.get(i).getName() + "\t" + zookeeperList.get(i).getLastname());
            
        }
        
    }
    
    public static void write() throws IOException {
        
        String line;
        
        FileWriter fw = new FileWriter("Zookeper.txt");
        BufferedWriter bw  = new BufferedWriter(fw);
        
        for(Zookeper z : zookeeperList) {
            
            line = z.getName() + z.getLastname() + z.getUsername() + z.getPassword() + z.getPhoneNumber() + z.getEmail() + z.getDepartment() + z.getAddress() + z.getSalary();
            
            bw.write(line);
            bw.newLine();
            
        }
        
        bw.flush();
        bw.close();
        
        
    }
    
    public static void read() throws Exception {
        
        FileReader fr = new FileReader("Zookeper.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line , str[];
        
        while( (line = br.readLine()) != null ) {
            
            str = line.split("\t");
            Zookeper z = new Zookeper(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8]);
            zookeeperList.add(z);
            
        }
        
        br.close();
        
        
    }
    
    public static void addZookeper(String name, String lastname, String username, String password, String phonenumber, String email, String Department, String address, String salary ) {

        try{
            String line;
        
            FileWriter fw = new FileWriter("Zookeper.txt",true);
            BufferedWriter bw  = new BufferedWriter(fw);
            
            line = name+":" + lastname+":" + username+":" + password+":" + phonenumber+":" + email+":"+ Department+":"+ address+":"+salary ;
            
            bw.write(line);
            bw.newLine();
            bw.flush();
            bw.close();
        
        
            }catch(Exception ex){
                System.out.println(ex);
            }
        
    }
    
    public static void removeZookeper(String name) {
        
        try{
            
            for(Zookeper temp : Zookeper.zookeeperList) {
                
                if(temp.getName().equals(name)) {
                    
                    Zookeper.zookeeperList.remove(temp);
                    
                    JOptionPane.showMessageDialog(null, "Zookeper" + temp.getName() + " has been deleted ");
                    
                }
                
            }
            
        } catch(Exception e){};
        
    }
    
}
