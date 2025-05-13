public class ForEachLoop {
    
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jack", "Jill"};
        String[] cars = {"Volvo", "BMW", "Mercedes", "Toyota"};
        
        // Using a for-each loop to iterate through the array
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
