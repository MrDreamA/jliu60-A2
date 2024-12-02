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
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getGender() {
        return super.getGender();
    }
    @Override
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
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }
}
