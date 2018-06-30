import com.sun.org.apache.xpath.internal.operations.Bool;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ManagerShowZookepersPanel extends JPanel {
    public  ArrayList<Zookeper> zookepers = new ArrayList<>();

    public ManagerShowZookepersPanel() {
        
        setMinimumSize(new Dimension(700, 500));
        setPreferredSize(new Dimension(700, 500));
        
        try{
                FileReader fr = new FileReader("Zookeper.txt");
                BufferedReader br = new BufferedReader(fr);
                String tmp=br.readLine();
                while(tmp!=null){
                    String[] str=tmp.split(":");
                    Zookeper zook = new Zookeper(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8]);
                    zookepers.add(zook);
                    tmp=br.readLine();
                
                }
                
        }catch(Exception ex){
            
            System.out.println(ex);
            
        }
        
        
        int row = zookepers.size();
        
        String[] columnName = {"Name","Family","Username","Password","PhoneNumber","Address","Email","Department","Salary"};
        
        DefaultTableModel t = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable table = new JTable(t);
        t.addColumn(columnName[0]);
        t.addColumn(columnName[1]);
        t.addColumn(columnName[2]);
        t.addColumn(columnName[3]);
        t.addColumn(columnName[4]);
        t.addColumn(columnName[5]);
        t.addColumn(columnName[6]);
        t.addColumn(columnName[7]);
        t.addColumn(columnName[8]);
        for(int i=0;i<zookepers.size();i++){
            t.addRow(new Object[]{zookepers.get(i).getName(),
                zookepers.get(i).getLastname(),
                zookepers.get(i).getUsername(),
                zookepers.get(i).getPassword(),
                zookepers.get(i).getPhoneNumber(),
                zookepers.get(i).getAddress(),
                zookepers.get(i).getEmail(),
                zookepers.get(i).getDepartment(),
                zookepers.get(i).getSalary()});
        }

        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(390, 360));
        scroll.setMinimumSize(new Dimension(390, 360));
        add(scroll);
         
    }
    
}
