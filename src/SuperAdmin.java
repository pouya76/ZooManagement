public class SuperAdmin extends Manager implements Showable {
    
    private String username;
    private String password;
    private String email;

    public SuperAdmin(String username, String password, String email) {
         super("", "", username, password, "", email , "","" );
       
    }
    void addManager(Manager m){
        super.addManager(m.name, m.lastname, m.username, m.password, m.phoneNumber, m.email, m.Address, m.Salary);
    }
    void deleteManager(Manager m){
        super.removeManager(m.name);
    }
    void editManager(Manager m){
        //edit in file 
    }
    void showManager(Manager m){
        super.show();
    }
    void setSalary(Manager m , String salary ){
       m.setSalary(Salary);
       
       //set in file
    }
    void editProfile(String username, String password, String email){
       
       // edit in file 
    }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //  from file 
    }

}
