import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Birds_Department extends Department implements Showable {
    
    static ArrayList<Birds_Department> birds_department_List = new ArrayList<>();
    
    static int size = Birds_Department.birds_department_List.size();
    
    private String Birds_Animal_in_research;

    public Birds_Department(String department_name, double ticket_price, int zookepers, String Birds_Animal_in_research) {
        super(department_name, ticket_price, zookepers);
        this.Birds_Animal_in_research = Birds_Animal_in_research;
    }

    public String getBirds_Animal_in_research() {
        return Birds_Animal_in_research;
    }

    public void setBirds_Animal_in_research(String Birds_in_research) {
        this.Birds_Animal_in_research = Birds_in_research;
    }
    
    @Override
    int getZookeperCount() {
        
        return birds_department_List.size();
        
    }

    @Override
    public void show() {
       
        
        
    }


}
