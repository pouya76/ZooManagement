import javax.security.auth.login.LoginContext;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class EntranceFrame extends JFrame {
    
    public static ArrayList<Manager> managers = new ArrayList<>();
    public static Manager manager;
    
    public static ArrayList<Visitor> visitors = new ArrayList<>();
    public static Visitor visitor;
    
    public static ArrayList<Zookeper> zookepers = new ArrayList<>();
    public static Zookeper zookeper;
    
    public static ArrayList<SuperAdmin> superAdmins = new ArrayList<>();
    public static SuperAdmin superAdmin;

    public static JComboBox comboBox;
    
    public EntranceFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();      
        this.setLocation(dim.width/3, dim.height/12);
        
        setMinimumSize(new Dimension(400, 350));
        setPreferredSize(new Dimension(400, 350));
        setResizable(false);
        
        JPanel centerPanel = new JPanel();
        add(centerPanel,BorderLayout.CENTER);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(100, 400));
        rightPanel.setPreferredSize(new Dimension(100, 400));
        add(rightPanel,BorderLayout.EAST);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setMinimumSize(new Dimension(100, 400));
        leftPanel.setPreferredSize(new Dimension(100, 400));
        add(leftPanel,BorderLayout.WEST);
        
        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(400, 50));
        upPanel.setPreferredSize(new Dimension(400, 50));
        add(upPanel,BorderLayout.NORTH);
        
        comboBox = new JComboBox();
        comboBox.addItem("Manager");
        comboBox.addItem("Visitor");
        comboBox.addItem("ZooKeeper");
        comboBox.addItem("Super Admin");
        comboBox.setMaximumSize(new Dimension(150, 30));
        comboBox.setPreferredSize(new Dimension(150, 30));
        
        final EmptyBorder comboBorder = new EmptyBorder(5, 0, 0, 0);
        comboBox.setBorder(comboBorder);
        
        upPanel.add(comboBox);
        
        JPanel downlPanel = new JPanel();
        downlPanel.setMinimumSize(new Dimension(400, 50));
        downlPanel.setPreferredSize(new Dimension(400, 50));
        add(downlPanel,BorderLayout.SOUTH);
        
        final JTextField userText = new JTextField();
        userText.setMinimumSize(new Dimension(180, 50));
        userText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(userText,BorderLayout.NORTH);
        
        final JTextField passText = new JTextField();
        passText.setMinimumSize(new Dimension(180, 50));
        passText.setPreferredSize(new Dimension(180, 50));
        centerPanel.add(passText,BorderLayout.CENTER);
        
        JLabel userLbl = new JLabel("USERNAME");
        final EmptyBorder userBorder = new EmptyBorder(20, 0, 0, 0);
        userLbl.setBorder(userBorder);
        
        JLabel passLbl = new JLabel("PASSWORD");
        final EmptyBorder passBorder = new EmptyBorder(27, 0, 0, 0);
        passLbl.setBorder(passBorder);
        
        leftPanel.add(userLbl);
        leftPanel.add(passLbl);
        
        JPanel cDownPanel = new JPanel();
        cDownPanel.setMinimumSize(new Dimension(150, 80));
        cDownPanel.setPreferredSize(new Dimension(150, 80));
        centerPanel.add(cDownPanel);
        
        JButton btnLogin = new JButton("LOGIN");
        cDownPanel.add(btnLogin,BorderLayout.WEST);
        
        JButton btnSignUp = new JButton("SIGN UP");
        cDownPanel.add(btnSignUp,BorderLayout.EAST);
        
        final JLabel loginStatus = new JLabel("LOGIN STATUS");
        final EmptyBorder statusBorder = new EmptyBorder(5, 0, 0, 0);
        loginStatus.setBorder(statusBorder);
        downlPanel.add(loginStatus);
        
        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String username = userText.getText();
                String password = passText.getText();
                
                if(comboBox.getSelectedIndex()==0) {
                    
                       String tmp;
                        String[] str = null;
                        
                        try {
                                FileReader fr = new FileReader("Manager.txt");
                                 BufferedReader br=new BufferedReader(fr);
                                  tmp=br.readLine();
                                    while(tmp!=null){
                                        str=tmp.split(":");
                                        String uname=userText.getText();
                                        String pass = passText.getText();
                                        if (str[2].equals(uname)){
                                            if(str[3].equals(pass)) {
                                                try{
                                                    Manager m = new Manager(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7]);
                                                    ManagerFrame managerframe = new ManagerFrame(m);
                                                    managerframe.setVisible(true);
                                                    
                                                    }catch(Exception ex){
                                                        System.out.println("cant open managerframe \t "+ex);
                                                    }
                                                    setVisible(false);

                                                    break;
                                            }
                                            else{
                                                 loginStatus.setText("WRONG PASSWORD");
                                                 loginStatus.setForeground(Color.red);
                                                 break;
                                                }
                                        }  
                                        tmp=br.readLine();
                                        if (tmp==null) {
                                          loginStatus.setText("MANAGER NOT EXIST");
                                          loginStatus.setForeground(Color.red);
                                          break;
                                        }
                                    }
                            }catch(Exception ex){
                                System.out.println(ex);
                            }
        
                }
                
                else if(comboBox.getSelectedIndex()==1) {
                                          
                    String tmp;
                    String[] str;
                    try {
                        FileReader fr = new FileReader("Visitor.txt");
                        BufferedReader br=new BufferedReader(fr);
                        tmp=br.readLine();
                        while(tmp!=null){
                            str=tmp.split(":");
                            String uname=userText.getText();
                            String pass = passText.getText();
                            if (str[2].equals(uname)){
                                if(str[3].equals(pass)) {
                                    Visitor vis= new Visitor(str[0],str[1],str[2],str[3],str[4],str[5],str[6]);
                                    VisitorFrame visitorframe = new VisitorFrame(vis);
                                    setVisible(false);
                                    visitorframe.setVisible(true);
                                    break;
                                }
                                else{
                                loginStatus.setText("WRONG PASSWORD");
                                loginStatus.setForeground(Color.red);
                                break;
                                }
                            }   
                            tmp=br.readLine();
                            if (tmp==null) {
                                loginStatus.setText("VISITOR NOT EXIST");
                                loginStatus.setForeground(Color.red);
                                break;
                            }
                        }
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                }
                
                else if(comboBox.getSelectedIndex()==2) {
                                                    
                    String tmp;
                    String[] str;
                    try {
                        FileReader fr = new FileReader("zookeper.txt");
                        BufferedReader br=new BufferedReader(fr);
                        tmp=br.readLine();
                        while(tmp!=null){
                            str=tmp.split(":");
                            String uname=userText.getText();
                            String pass = passText.getText();
                            if (str[2].equals(uname)){
                                if(str[3].equals(pass)) {
                                    Zookeper zook= new Zookeper(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8]);
                                    ZookeperFrame zookeperframe = new ZookeperFrame(zook);
                                    setVisible(false);
                                    zookeperframe.setVisible(true);
                                    break;
                                }
                                else{
                                    loginStatus.setText("WRONG PASSWORD");
                                    loginStatus.setForeground(Color.red);
                                    break;
                                }
                            }
                            tmp=br.readLine();
                            if (tmp==null) {
                                loginStatus.setText("ZOOKEPER NOT EXIST");
                                loginStatus.setForeground(Color.red);
                                break;
                            }
                        }
                    }catch(Exception ex){
                        
                    }

                } 
                
                else if(comboBox.getSelectedIndex()==3) {
                              
                    String tmp;
                    String[] str;
                    try {
                        FileReader fr = new FileReader("SuperAdmin.txt");
                        BufferedReader br=new BufferedReader(fr);
                        tmp=br.readLine();
                        while(tmp!=null){
                            str=tmp.split(":");
                            String uname=userText.getText();
                            String pass = passText.getText();
                                if (str[0].equals(uname)){
                                if(str[1].equals(pass)) {
                                    SuperAdminFrame superAdminframe = new SuperAdminFrame();
                                    setVisible(false);
                                    superAdminframe.setVisible(true);
                                    break;
                                }
                                else{
                                    loginStatus.setText("WRONG PASSWORD");
                                    loginStatus.setForeground(Color.red);
                                    break;
                            }
                        }

                        tmp=br.readLine();

                         if (tmp==null) {
                           loginStatus.setText("SUPERADMIN NOT EXIST");
                           loginStatus.setForeground(Color.red);
                           break;
                       }
                    }
                }catch(Exception ex){
                        
                }
 
            }
        }
    });
        
        loginStatus.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                loginStatus.setText("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginStatus.setBackground(Color.GREEN);
                loginStatus.setText("LOGIN STATUS");
            }
        });
        
        btnSignUp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                SignUpFrame frame = new SignUpFrame();
                frame.setVisible(true);
                
            }
        });
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        
        EntranceFrame entrance = new EntranceFrame();
        entrance.setVisible(true);
        
    }
    
}
