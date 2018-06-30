import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Wild extends Animal implements Showable {
    
    static ArrayList<Wild> wildList = new ArrayList<Wild>();
    
    private String home;

    public Wild(String name, String sex, String nationality, String national_id, String insurance, String food, String department_of_living, String home) {
        super(name, sex, nationality, national_id, insurance, food, department_of_living);
        this.home = home;
    }

    @Override
    public void show() {
        
        for(int i=0 ; i<wildList.size() ; i++) {
            
            // Add new Comment by ali
            JOptionPane.showMessageDialog(null, i+" ) "+ wildList.get(i).getName() + "\t" + wildList.get(i).getDepartment_of_living());
            
        }
        
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
    
    
    public static void write() throws IOException {
        
        String line;
        
        FileWriter fw = new FileWriter("Wild.txt");
        BufferedWriter bw  = new BufferedWriter(fw);
        
        for(Wild w : wildList) {
            
            line = w.getName()+ w.getSex()+ w.getNationality()+ w.getNational_id()+ w.getInsurance()+ w.getFood()+ w.getDepartment_of_living()+ w.getHome();
            
            bw.write(line);
            bw.newLine();
            
        }
        
        bw.flush();
        bw.close();
        
        
    }
    
    public static void read() throws Exception {
        
        FileReader fr = new FileReader("Wild.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line , str[];
        
        while( (line = br.readLine()) != null ) {
            
            str = line.split("\t");
            Wild w = new Wild(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]);
            wildList.add(w);
            
        }
        
        br.close();

    }
    
    public static void addWild(String name, String sex, String nationality, String national_id, String insurance, String food, String department_of_living, String home ) {

        try{
            String line;
        
            FileWriter fw = new FileWriter("Wild.txt",true);
            BufferedWriter bw  = new BufferedWriter(fw);

            line = name+":" + sex+":" + nationality+":" + national_id+":" + insurance+":" + food+":"+ department_of_living+":"+ home ;
            
            bw.write(line);
            bw.newLine();
            bw.flush();
            bw.close();

            }catch(Exception ex){
                System.out.println(ex);
            }
    }
    
    public static void removeBird(String name) {
        
        try{
            
            for(Wild temp : Wild.wildList) {
                
                if(temp.getName().equals(name)) {
                    
                    Wild.wildList.remove(temp);
                    
                    JOptionPane.showMessageDialog(null, "Wild" + temp.getName() + " has been deleted ");
                    
                }
                
            }
            
        } catch(Exception e){};
        
    }
    
}
