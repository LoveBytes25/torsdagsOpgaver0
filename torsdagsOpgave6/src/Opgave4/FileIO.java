package Opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public String readFileContent(String filename) throws FileNotFoundException {
        Scanner fileScanner = null;
        // Create file object from filename
        File file = new File("data/" + filename);
        // Create scanner object on file
        fileScanner = new Scanner(file);
        // Print file contents using StringBuilder class
        StringBuilder sb = new StringBuilder();

        // Checks if file has next line and adds new lines accordingly
        while (fileScanner.hasNextLine()) {
            sb.append(fileScanner.nextLine());
             if (fileScanner.hasNextLine()) {
                sb.append("\n");
                }
            }

            // Return content
            return sb.toString();
    }

}
