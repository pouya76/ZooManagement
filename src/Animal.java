public abstract class Animal extends LiveCreature{
    
    private String sex;
    private String nationality;
    private String national_id;
    private String insurance;
    private String food;
    private String department_of_living;

    public Animal(String name, String sex, String nationality, String national_id, String insurance, String food, String department_of_living) {
        super(name);
        this.sex = sex;
        this.nationality = nationality;
        this.national_id = national_id;
        this.insurance = insurance;
        this.food = food;
        this.department_of_living = department_of_living;
    }

    

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDepartment_of_living() {
        return department_of_living;
    }

    public void setDepartment_of_living(String department_of_living) {
        this.department_of_living = department_of_living;
    }

}
