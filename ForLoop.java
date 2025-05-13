public class ForLoop {
    
    public static void main(String[] args){
        // int height = 5;
        // System.out.println("Right-Angle Traingle:");

        // for (int i = 1; i <= height; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        int height = 5;

        System.out.println("Pyramid");

        for (int i = 1; i <= height; i++) {

            // Print spaces
            for (int j = 1; j <= height - i; j++){
                System.out.println(" ");
            }

            // Print Stars
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.println("* ");
            }

            System.out.println();
        }

    }
}
