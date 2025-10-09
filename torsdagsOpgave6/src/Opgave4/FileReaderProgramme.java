package Opgave4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderProgramme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();
        boolean fileFound = false;

        while(!fileFound) {
            // Prompt user for a filename
            System.out.println("Please enter a filename with filetype .txt. Do not" +
                    " type the filetype, and ensure that the file is in the data folder. ");

            // Save input and call readFileContent
            try {
                String content = fileIO.readFileContent(scanner.nextLine() + ".txt");
                System.out.println(content);

                fileFound = true;

            } catch (FileNotFoundException e) {
                System.out.println("File not found, try a different filename.");
            }
        }
        scanner.close();
    }
}
