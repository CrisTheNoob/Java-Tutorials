public class Method {
    static void myMethod(){
        System.out.println("This is Static Method");
    }

    static void fNames(String fname){
        System.out.println("My Name is " + fname);
    }

    // Method with Parameters
    static void checkAge(int age){
        if (age < 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }
    }

    // Method with return values
    static int ReturnValues(int x , int y){
        return x + y;
    }


    public static void main(String[] args){
        myMethod();
        fNames("Cris John");
        checkAge(13);
        
        // Method with return values
        int z = ReturnValues(5,5);
        System.out.println(z);

    }
}
