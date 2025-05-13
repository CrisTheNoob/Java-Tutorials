public class DataTypes {
    
    public static void main(String[] args){
        int myInt = 9;
        double myInt_double = myInt;
        String fName = "Cris John";
        String lName = "Ramirez";
        int value1 = 10;
        int value2 = 20;
        double randomNum = Math.random();

        int randomNumControl = (int)(Math.random() * 11);

        System.out.println(myInt_double);
        System.out.println(fName.concat(lName));
        System.out.println(Math.max(value1, value2));
        System.out.println(randomNum);
        System.out.println(randomNumControl);
    }
}

// nag declare ako ng variable name na myInt = 9
// nag declare ako ng variable name na myInt_double = myInt
//nag declare ako para yung myInt maging double na magkakaroon ng .0