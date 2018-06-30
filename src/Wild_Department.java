import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Wild_Department extends Department implements Showable {
    
    static ArrayList<Wild_Department> wild_department_List = new ArrayList<>();
    static int size = Wild_Department.wild_department_List.size();
    
    private String Wild_Animal_in_research;

    public Wild_Department(String department_name, double ticket_price, int zookepers, String Wild_Animal_in_research) {
        super(department_name, ticket_price, zookepers);
        this.Wild_Animal_in_research = Wild_Animal_in_research;
    }

    public String getWild_Animal_in_research() {
        return Wild_Animal_in_research;
    }

    public void setWild_Animal_in_research(String Wild_in_research) {
        this.Wild_Animal_in_research = Wild_in_research;
    }

    @Override
    int getZookeperCount() { 
        return wild_department_List.size();  
    }

    @Override
    public void show() {
        
        
        
    }

}
