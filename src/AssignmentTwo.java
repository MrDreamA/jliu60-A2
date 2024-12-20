public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
//        a2.partThree();
//        a2.partFourA();
//        a2.partFourB();
//        a2.partFive();
//        a2.partSix();
        a2.partSeven();
    }
    public void partThree(){
        // Create a Ride
        Ride rollerCoaster = new Ride("Ave Mujica",5, 2, null);

        // Create Visitors
        Visitor visitor1 = new Visitor("Oblivionis", "Female", 180, 0, 17);
        Visitor visitor2 = new Visitor("Mortis", "Female", 160, 0, 16);
        Visitor visitor3 = new Visitor("Doloris", "Female", 190, 1, 18);
        Visitor visitor4 = new Visitor("Timoris", "Female", 170, 1, 16);
        Visitor visitor5 = new Visitor("Amoris", "Female", 150, 2, 15);

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
        // Create a Ride
        Ride rollerCoaster = new Ride("Ave Mujica",5, 2, null);

        // Create Visitors
        Visitor visitor1 = new Visitor("Oblivionis", "Female", 180, 0, 17);
        Visitor visitor2 = new Visitor("Mortis", "Female", 160, 0, 16);
        Visitor visitor3 = new Visitor("Doloris", "Female", 190, 1, 18);
        Visitor visitor4 = new Visitor("Timoris", "Female", 170, 1, 16);
        Visitor visitor5 = new Visitor("Amoris", "Female", 150, 2, 15);
        // Add visitors into the history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // Check if a visitor is in the history
        rollerCoaster.checkVisitorFromHistory(visitor1);

        // Print the number of visitors in the history
        rollerCoaster.numberOfVisitors();

        // Print the history
        rollerCoaster.printRideHistory();

    }
    public void partFourB(){
        // Create a Ride
        Ride rollerCoaster = new Ride("Ave Mujica",5, 2, null);

        // Create Visitors
        Visitor visitor1 = new Visitor("Oblivionis", "Female", 180, 0, 17);
        Visitor visitor2 = new Visitor("Mortis", "Female", 160, 0, 16);
        Visitor visitor3 = new Visitor("Doloris", "Female", 190, 1, 18);
        Visitor visitor4 = new Visitor("Timoris", "Female", 170, 1, 16);
        Visitor visitor5 = new Visitor("Amoris", "Female", 150, 2, 15);
        // Add visitors into the history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // Print the history
        rollerCoaster.printRideHistory();

        // Sort the history
        rollerCoaster.sortRideHistory();
        System.out.println("Sorted Start Here:");

        // Print the history again
        rollerCoaster.printRideHistory();

    }
    public void partFive(){
        // Create a Ride
        Employee employee = new Employee("Admin", "Male", 190, "Admin", "Admin");
        Ride rollerCoaster = new Ride("Ave Mujica",10, 5, employee);
        // Add 10 visitors into the queue
        Visitor visitor1 = new Visitor("Oblivionis", "Female", 180, 0, 17);
        Visitor visitor2 = new Visitor("Mortis", "Female", 160, 0, 16);
        Visitor visitor3 = new Visitor("Doloris", "Female", 190, 1, 17);
        Visitor visitor4 = new Visitor("Timoris", "Female", 170, 1, 16);
        Visitor visitor5 = new Visitor("Amoris", "Female", 150, 2, 15);
        Visitor visitor6 = new Visitor("Anon", "Female", 190, 1, 26);
        Visitor visitor7 = new Visitor("Soyo", "Female", 150, 1, 26);
        Visitor visitor8 = new Visitor("Tomori","Female",150,1,30);
        Visitor visitor9 = new Visitor("Rana","Female",150,1,3);
        Visitor visitor10 = new Visitor("Taki","Female",156,0,20);

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        // Print the queue
        System.out.println("Queue:");
        rollerCoaster.printQueue();
        System.out.println("-------------------------------------");
        System.out.println();


        // Run one cycle
        rollerCoaster.runOneCycle();
        System.out.println("-------------------------------------");

        // Print the queue again
        System.out.println("Updated Queue:");
        rollerCoaster.printQueue();
        System.out.println("-------------------------------------");



        // Print History
        System.out.println("History:");
        rollerCoaster.printRideHistory();




    }
    public void partSix(){
        // Create a Ride
        Ride rollerCoaster = new Ride("Ave Mujica",5, 2, null);

        // Create Visitors
        Visitor visitor1 = new Visitor("Oblivionis", "Female", 180, 0, 17);
        Visitor visitor2 = new Visitor("Mortis", "Female", 160, 0, 16);
        Visitor visitor3 = new Visitor("Doloris", "Female", 190, 1, 18);
        Visitor visitor4 = new Visitor("Timoris", "Female", 170, 1, 16);
        Visitor visitor5 = new Visitor("Amoris", "Female", 150, 2, 15);
        // Add visitors into the history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // Export history
        rollerCoaster.exportRideHistory();
    }
    public void partSeven(){
        // Create a Ride
        Ride rollerCoaster = new Ride("Ave Mujica",5, 2, null);

        // Read file
        rollerCoaster.importRideHistory();
        // Print number of visitors
        rollerCoaster.numberOfVisitors();
        // Print all visitors
        rollerCoaster.printRideHistory();
    }
}
