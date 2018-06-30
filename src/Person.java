public abstract class Person extends LiveCreature{
    
    protected String lastname;
    protected String username;
    protected String password;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String lastname, String username, String password, String phoneNumber, String email) {
        super(name);
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    @Override
    public String getName() {
        
        return name;
        
    }
    
    public void setName(String name) { 
        this.name = name;  
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
