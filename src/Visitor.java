public class Visitor extends Person{
    // Declare instance variables
    private int vip;
    private int age;

    // Constructors
    public Visitor(){
        super();
        this.vip = 0;
        this.age = 0;
    }

    public Visitor(String name, String gender, int height, int vip, int age){
        super(name, gender, height);
        this.vip = vip;
        this.age = age;
    }

    // Getters
    public int getVip() {
        return vip;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public String getGender(){
        return super.getGender();
    }
    @Override
    public int getHeight(){
        return super.getHeight();
    }

    // Setters
    public void setVip(int vip) {
        this.vip = vip;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void setName(String name){
        super.setName(name);
    }
    @Override
    public void setGender(String gender){
        super.setGender(gender);
    }
    @Override
    public void setHeight(int height){
        super.setHeight(height);
    }

}
