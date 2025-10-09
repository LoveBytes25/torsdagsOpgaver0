package Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1: Prompt user to enter a filename via Scanner
        // 2: Using scanner to read from file
        Scanner sc = new Scanner(System.in);
        boolean fileFound = false;

        // Using while loop to ensure we keep going until the file is found
        while (!fileFound){
            try {
                System.out.println("Please enter a filename with filetype .txt. Do not" +
                        " type the filetype, and ensure that the file is in the data folder. ");
                String fileName = sc.nextLine() + ".txt";

                // Create file object from filename
                File file = new File("data/"+ fileName);
                // Create scanner object on file
                Scanner fileScanner = new Scanner(file);

                // If the file is found, chhange the boolean as exit condition for while loop
                fileFound = true;

                // Print file contents
                while(fileScanner.hasNextLine()){
                    String text = fileScanner.nextLine();
                    System.out.println(text);
                }

                // Close scanner
                fileScanner.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found! Please try again.");
            }
        }

        // Close scanner for system input
        sc.close();


    }
}
