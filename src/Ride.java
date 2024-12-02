public class Ride {
    // Declare instance variables
    private String name;
    private int maxPassenger;
    private Employee employee;
    
    // Constructor
    public Ride() {
        this.name = null;
        this.maxPassenger = 0;
        this.employee = null;
    }
    public Ride(String name, int maxPassenger, Employee employee) {
        this.name = name;
        this.maxPassenger = maxPassenger;
        this.employee = employee;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getMaxPassenger() {
        return maxPassenger;
    }
    public Employee getEmployee() {
        return employee;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}