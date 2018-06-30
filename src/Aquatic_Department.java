import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aquatic_Department extends Department implements Showable {
    
    static ArrayList<Aquatic_Department> aquatic_department_List = new ArrayList<>();
    
    static int size = Aquatic_Department.aquatic_department_List.size();
    
    private String Aquatic_Animal_in_research;

    public Aquatic_Department(String department_name, double ticket_price, int zookepers, String Aquatic_Animal_in_research) {
        super(department_name, ticket_price, zookepers);
        this.Aquatic_Animal_in_research = Aquatic_Animal_in_research;
    }

    public String getAquatic_Animal_in_research() {
        return Aquatic_Animal_in_research;
    }

    public void setAquatic_in_research(String Aquatic_Animal_in_research) {
        this.Aquatic_Animal_in_research = Aquatic_Animal_in_research;
    }

    @Override
    int getZookeperCount() {
        
        return aquatic_department_List.size();
        
    }

    @Override
    public void show() {
        
        
        
    }


}
