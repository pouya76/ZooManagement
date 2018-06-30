import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Bird extends Animal implements Showable {
    
    static ArrayList<Bird> birdList = new ArrayList<Bird>();
    
    private boolean wildness;

    public Bird(String name, String sex, String nationality, String national_id, String insurance, String food, String department_of_living, boolean wildness) {
        super(name, sex, nationality, national_id, insurance, food, department_of_living);
        this.wildness = wildness;
    }
   public void Bird(){
        
    }

    public boolean getWild() {
        return wildness;
    }

    public void setWild(boolean wildness) {
        this.wildness = wildness;
    }

    @Override
    public void show() {
        
        for(int i=0 ; i<birdList.size() ; i++) {
            
            JOptionPane.showMessageDialog(null, i+" ) "+ birdList.get(i).getName() + "\t" + birdList.get(i).getDepartment_of_living());
            
        }
        
    } 
    
    public static void write() throws IOException {
        
        String line;
        
        FileWriter fw = new FileWriter("Bird.txt");
        BufferedWriter bw  = new BufferedWriter(fw);
        
        for(Bird b : birdList) {
            
            line = b.getName()+ b.getSex()+ b.getNationality()+ b.getNational_id()+ b.getInsurance()+ b.getFood()+ b.getDepartment_of_living()+ b.getWild();
            
            bw.write(line);
            bw.newLine();
            
        }
        
        bw.flush();
        bw.close();
        
        
    }
    
    public static void read() throws Exception {
        
        FileReader fr = new FileReader("Bird.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line , str[];
        
        while( (line = br.readLine()) != null ) {
            
            str = line.split("\t");
            Bird b = new Bird(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7].equals(true));
            birdList.add(b);
            
        }
        
        br.close();

    }
    
    public static void addBird(String name, String sex, String nationality, String national_id, String insurance, String food, String department_of_living, boolean wildness ) {
        
        try{
            
            String line;
        
            FileWriter fw = new FileWriter("Bird.txt",true);
            BufferedWriter bw  = new BufferedWriter(fw);
       
            line = name+":" + sex+":" + nationality+":" + national_id+":" + insurance+":" + food+":"+ department_of_living+":"+ wildness ;
            
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
            
            for(Bird temp : Bird.birdList) {
                
                if(temp.getName().equals(name)) {
                    
                    Bird.birdList.remove(temp);
                    
                    JOptionPane.showMessageDialog(null, "Bird" + temp.getName() + " has been deleted ");
                    
                }
                
            }
            
        } catch(Exception e){};
        
    }
    
}
