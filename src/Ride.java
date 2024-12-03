import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface{
    // Declare instance variables
    private String name;
    private int maxPassenger;
    private Employee employee;

    // Declare queue
    Queue<Visitor> visitorQueue = new LinkedList<>();

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
    // Queue Methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        visitorQueue.remove(visitor);
    }

    @Override
    public void printQueue() {
        int index = 1;
        for (Visitor visitor : visitorQueue) {
            System.out.println("Visitor "+index);
            System.out.println("Name: "+visitor.getName());
            System.out.println("Gender: "+visitor.getGender());
            System.out.println("Height: "+visitor.getHeight());
            System.out.println("VIP: "+visitor.getVip());
            System.out.println("Age: "+visitor.getAge());
            System.out.println("-----------");
            index++;
        }
    }

    // Run methods
    @Override
    public void runOneCycle() {

    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {

    }

    @Override
    public void checkVisitorFromHistory(Visitor visitor) {

    }

    @Override
    public void numberOfVisitors() {

    }

    @Override
    public void printRideHistory() {

    }
}