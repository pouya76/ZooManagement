import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aquatic extends Animal implements Showable {
    
    static ArrayList<Aquatic> aquaticList = new ArrayList<Aquatic>();
    
    private boolean carnivorous;

    public Aquatic(String name, String sex, String nationality, String national_id, String insurance, String food, String department_of_living, boolean carnivorous) {
        super(name, sex, nationality, national_id, insurance, food, department_of_living);
        this.carnivorous = carnivorous;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    @Override
    public void show() {
        
        for(int i=0 ; i<aquaticList.size() ; i++) {
            
            JOptionPane.showMessageDialog(null, i+" ) "+ aquaticList.get(i).getName() + "\t" + aquaticList.get(i).getDepartment_of_living());
            
        }
        
    }
    
    public static void write() throws IOException {
        
        String line;
        
        FileWriter fw = new FileWriter("Aquatic.txt");
        BufferedWriter bw  = new BufferedWriter(fw);
        
        for(Aquatic a : aquaticList) {
            
            line = a.getName()+ a.getSex()+ a.getNationality()+ a.getNational_id()+ a.getInsurance()+ a.getFood()+ a.getDepartment_of_living()+ a.isCarnivorous();
            
            bw.write(line);
            bw.newLine();
            
        }
        
        bw.flush();
        bw.close();
        
        
    }
    
    public static void read() throws Exception {
        
        FileReader fr = new FileReader("Aquatic.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line , str[];
        
        while( (line = br.readLine()) != null ) {
            
            str = line.split("\t");
            Aquatic a = new Aquatic(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7].equals(true));
            aquaticList.add(a);
            
        }
        
        br.close();
        
        
    }
    
    public static void addAquatic(String name, String sex, String nationality, String national_id, String insurance, String food, String department_of_living, boolean carnivorous ) {
        
          try{
                String line;

                FileWriter fw = new FileWriter("Aquatic.txt",true);
                BufferedWriter bw  = new BufferedWriter(fw);

                line = name+":" + sex+":" + nationality+":" + national_id+":" + insurance+":" + food+":"+ department_of_living+":"+ carnivorous ;

                bw.write(line);
                bw.newLine();
                bw.flush();
                bw.close();

                }catch(Exception ex){
                    System.out.println(ex);
                }
        
        
    }
    
    public void removeZookeper(String name) {
        
        try{
            
            for(Aquatic temp : Aquatic.aquaticList) {
                
                if(temp.getName().equals(name)) {
                    
                    Aquatic.aquaticList.remove(temp);
                    
                    JOptionPane.showMessageDialog(null, "Aquatic" + temp.getName() + " has been deleted ");
                    
                }
                
            }
            
        } catch(Exception e){
            
            System.out.println(e.getMessage());
        
        };
        
    }

}
