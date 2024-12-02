public class Employee extends Person{
    private String department;
    private String job;

    // Constructors
    public Employee(){
        super();
        this.department = null;
        this.job = null;
    }
    public Employee(String name, String gender, int height, String department, String job){
        super(name, gender, height);
        this.department = department;
        this.job = job;
    }

    // Getters
    public String getDepartment() {
        return department;
    }
    public String getJob() {
        return job;
    }
    public String getName() {
        return super.getName();
    }
    public String getGender() {
        return super.getGender();
    }
    public int getHeight() {
        return super.getHeight();
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setName(String name) {
        super.setName(name);
    }
    public void setGender(String gender) {
        super.setGender(gender);
    }
    public void setHeight(int height) {
        super.setHeight(height);
    }
}
