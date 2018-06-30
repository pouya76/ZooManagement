import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Visitor extends Person implements Showable {

    static ArrayList<Visitor> visitorList = new ArrayList<Visitor>();

    private String cash;

    public Visitor(String name, String lastname, String username, String password, String phoneNumber, String email, String cash) {
        super(name, lastname, username, password, phoneNumber, email);
        this.cash = cash;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    @Override
    public void show() {

        for (int i = 0; i < visitorList.size(); i++) {

            JOptionPane.showMessageDialog(null, i + " ) " + visitorList.get(i).getName() + "\t" + visitorList.get(i).getLastname());

        }

    }

    public static void write_Visitor() throws IOException {

        String line;

        FileWriter fw = new FileWriter("Visitor.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (Visitor v : visitorList) {

            line = v.getName() + v.getLastname() + v.getUsername() + v.getPassword() + v.getPhoneNumber() + v.getEmail() + v.getCash();

            bw.write(line);
            bw.newLine();

        }

        bw.flush();
        bw.close();

    }
    
    public static void write_Comment() throws IOException {
        
        
        
        FileWriter fw = new FileWriter("Comment.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        
        
    }

    public static void read() throws Exception {

        FileReader fr = new FileReader("Zookeper.txt");
        BufferedReader br = new BufferedReader(fr);

        String line, str[];

        while ((line = br.readLine()) != null) {

            str = line.split("\t");
            Visitor v = new Visitor(str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
            visitorList.add(v);

        }

        br.close();

    }

    public static void addVisitor(String name, String lastname, String username, String password, String phonenumber, String email, String cash ) {
        
        Visitor visitor = new Visitor(name, lastname, username, password, phonenumber, email, cash);
        
        Visitor.visitorList.add(visitor);
        
    }

    public static void removeVisitor(String name) {

        try {

            for (Visitor temp : Visitor.visitorList) {

                if (temp.getName().equals(name)) {

                    Visitor.visitorList.remove(temp);

                    JOptionPane.showMessageDialog(null, "Visitor" + temp.getName() + " has been deleted ");

                }

            }

        } catch (Exception e) {
        };

    }

}
