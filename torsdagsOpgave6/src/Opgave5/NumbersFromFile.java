package Opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumbersFromFile {
    public static void main(String[] args) {
        int[] numArray = new int[5];

        try {
            // Make file and scanner object to read numbers from file
            File numFile = new File("data/tal.txt");
            Scanner sc = new Scanner(numFile);

            // Initialize index variable for loop
            int index = 0;

            // Read each line in file and store each line in array
            // We parse here in case it gets read as a String and not an int
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Parse String to integer and store in array
                numArray[index] = Integer.parseInt(line);

                // Keep filling array until no more lines in file
                index++;
            }

            // Close scanner
            sc.close();

            // Show array contents to check if it worked:
            System.out.println("Numbers found in file: ");
            for (int i = 0; i < numArray.length; i++) {
                System.out.println("numArray[" + i + "] = " + numArray[i]);
            }

        } catch (FileNotFoundException e) {
            // If the file doesn't exist or cannot be found
            System.out.println("File not found! Please ensure file is exists in the data folder");

        } catch (ArrayIndexOutOfBoundsException e){
            // In case file has more than 5 numbers
            System.out.println("File contains too many numbers. Ensure file has no more than 5 numbers");

        } catch (NumberFormatException e) {
            // case of file containing text instead of numbers
            System.out.println("File has invalid data, please ensure file only contains numbers");
        }
    }
}
