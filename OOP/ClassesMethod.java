package OOP;

public class ClassesMethod {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Encapsulated method
    private String name;

    // Getter method
    public String getName(){
        return name;
    }
    // Setter method
    public void setName(String newName){
        this.name = newName;
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method

        ClassesMethod myObj = new ClassesMethod(); // Create an object of ClassesMethod
        myObj.myPublicMethod(); // Call the public method

        // Encapsulated method
        ClassesMethod privatename = new ClassesMethod();
        privatename.setName("Cris JOhn");
        System.out.println(privatename.getName());
    }
}
