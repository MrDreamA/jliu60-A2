import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface{
    // Declare instance variables
    private String name;
    private int time;
    private int maxRider;
    private Employee employee;
    private int numOfCycles;

    // Declare queue
    Queue<Visitor> visitorQueue = new LinkedList<>();

    // Declare a history list
    LinkedList<Visitor> visitorHistory = new LinkedList<>();

    // Constructor
    public Ride() {
        this.name = null;
        this.time = 0;
        this.maxRider = 1;
        this.employee = null;
        this.numOfCycles = 0;
    }
    public Ride(String name,int time, int maxRider, Employee employee) {
        this.name = name;
        this.time = time;
        this.maxRider = maxRider;
        this.employee = employee;
        numOfCycles = 0;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getTime() {
        return time;
    }
    public int getMaxRider() {
        return maxRider;
    }
    public Employee getEmployee() {
        return employee;
    }
    public int getNumOfCycles() {
        return numOfCycles;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }
    // Queue Methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if(visitorQueue.add(visitor)){
            System.out.println("Visitor "+ visitor.getName() +" added to waiting queue");
        }
        else{
            System.out.println("Visitor "+ visitor.getName() +" cannot be added to waiting queue");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if(visitorQueue.remove(visitor)){
            System.out.println("Visitor "+ visitor.getName() +" removed from waiting queue");
        }else{
            System.out.println("Visitor "+ visitor.getName() +" cannot be removed from waiting queue");
        }
    }

    @Override
    public void printQueue() {
        int index = 1;
        if(visitorQueue.isEmpty()){
            System.out.println("Waiting queue is empty");
        }else{
            for (Visitor visitor : visitorQueue) {
                System.out.println("Visitor "+index);
                printVisitorDetails(visitor);
                index++;
            }
        }
    }

    // Run methods
    @Override
    public void runOneCycle() {
        if(this.employee == null){
            System.out.println("No employee assigned to this ride");
        }
        else{
            if(visitorQueue.isEmpty()){
                System.out.println("Waiting queue is empty");
            }
            else{
                for(int i = 1;i<= this.maxRider; i++){
                    if(visitorQueue.isEmpty()){
                        break;
                    }
                    else{
                        Visitor visitor = visitorQueue.poll();
                        visitorHistory.add(visitor);
                        System.out.println("Visitor "+visitor.getName() +" removed from waiting queue");
                    }
                }
                numOfCycles++;
            }
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if(visitorHistory.add(visitor)){
            System.out.println("Visitor "+ visitor.getName() +" added to history");
        }
        else{
            System.out.println("Visitor "+ visitor.getName() +" cannot be added to history");
        }

    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if(visitorHistory.isEmpty()){
            System.out.println("Ride history is empty");
        }
        else{
            if(visitorHistory.contains(visitor)){
                System.out.println("Visitor "+ visitor.getName() +" is in history");
            }
            else{
                System.out.println("Visitor "+ visitor.getName() +" is not in history");
            }
        }
        return visitorHistory.contains(visitor);

    }

    @Override
    public int numberOfVisitors() {
        System.out.println("Number of history visitors: "+visitorHistory.size());
        return visitorHistory.size();
    }

    @Override
    public void printRideHistory() {
        if(visitorHistory.isEmpty()){
            System.out.println("Ride history is empty");
        }
        else{
            // Use iterator
            Iterator<Visitor> it = visitorHistory.iterator();
            while (it.hasNext()) {
                Visitor visitor = it.next();
                printVisitorDetails(visitor);
            }
        }

    }

    // This method is used to print a visitor's details
    public void printVisitorDetails(Visitor visitor) {
        System.out.println("Name: "+visitor.getName());
        System.out.println("Gender: "+visitor.getGender());
        System.out.println("Height: "+visitor.getHeight());
        System.out.println("VIP: "+visitor.getVip());
        System.out.println("Age: "+visitor.getAge());
        System.out.println("-----------");
    }

    public void sortRideHistory(){
        visitorHistory.sort(new VisitorComparator());
    }

    public void exportRideHistory(){
        if(visitorHistory.isEmpty()){
            System.out.println("Ride history is empty");
        }
        else{
            // Use iterator
            Iterator<Visitor> it = visitorHistory.iterator();
            while (it.hasNext()) {
                Visitor visitor = it.next();
                printVisitorDetails(visitor);
            }
        }


}