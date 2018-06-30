import com.sun.org.apache.xpath.internal.operations.Bool;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SuperAdminShowManagersPanel extends JPanel {
    public  ArrayList<Manager> managers = new ArrayList<>();
      
    public SuperAdminShowManagersPanel() {
        
        setMinimumSize(new Dimension(700, 500));
        setPreferredSize(new Dimension(700, 500));

        try{
            FileReader fr = new FileReader("Manager.txt");
            BufferedReader br = new BufferedReader(fr);
            String tmp=br.readLine();
            while(tmp!=null){
                String[] str=tmp.split(":");
                Manager zook = new Manager(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7]);
                managers.add(zook);
                tmp=br.readLine();
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        int row = managers.size();
        
        String[] columnName = {"Name","Family","Username","Password","PhoneNumber","Address","Email","Salary"};
        
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
        
        for(int i=0;i<managers.size();i++){
            t.addRow(new Object[]{managers.get(i).getName(),
                managers.get(i).getLastname(),
                managers.get(i).getUsername(),
                managers.get(i).getPassword(),
                managers.get(i).getPhoneNumber(),
                managers.get(i).getAddress(),
                managers.get(i).getEmail(),
                managers.get(i).getSalary()});
        }

        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(390, 360));
        scroll.setMinimumSize(new Dimension(390, 360));
        add(scroll);
                
    }
    
}

