public abstract class Person {
    // Declare instance variables
    private String name;
    private String gender;
    private int height;

    // Constructors
    public Person(){
        this.name = null;
        this.gender = null;
        this.height = 0;
    }
    public Person(String name, String gender, int height){
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setHeight(int height){
        this.height = height;
    }
}
