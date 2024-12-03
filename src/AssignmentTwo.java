public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
        a2.partThree();
    }
    public void partThree(){
        // Create a Ride
        Ride rollerCoaster = new Ride("Roller Coaster", 2, null);

        // Create Visitors
        Visitor visitor1 = new Visitor("Honkai", "Male", 180, "No", 20);
        Visitor visitor2 = new Visitor("ZZZ", "Female", 160, "Yes", 25);
        Visitor visitor3 = new Visitor("StarRail", "Male", 190, "Yes", 22);
        Visitor visitor4 = new Visitor("Genshin", "Female", 170, "No", 24);
        Visitor visitor5 = new Visitor("Mihoyo", "Male", 200, "Yes", 21);

        // Add visitors into the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue(visitor2);

        // Print the queue
        rollerCoaster.printQueue();
    }
    public void partFourA(){
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}
