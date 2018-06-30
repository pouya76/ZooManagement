public abstract class Department {
    
    private static int idcount=1;
    private int Id;
    private String department_name;
    private double ticket_price;
    private int zookepersCount;
    
    public Department(String department_name, double ticket_price, int zookepeerCount) {
        
        Id = ++idcount;
        this.department_name = department_name;
        this.ticket_price = ticket_price;
        this.zookepersCount = zookepeerCount;
        
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

    abstract int getZookeperCount();

}
