package File_handling;

import java.io.File;

public class FileChecker {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File already exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
