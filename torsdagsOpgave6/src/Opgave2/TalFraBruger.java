package Opgave2;

import java.time.LocalDate;
import java.util.Scanner;

public class TalFraBruger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int birthYear = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Please enter your birthyear:");
                    String input = scanner.nextLine();

                    // Brug Integer.parseInt til at konvertere input til int
                    // Beregn brugerens alder (antag at nuværende år er 2025)
                    birthYear = Integer.parseInt(input);

                    // End condition for loop if the age entered IS a number
                    validInput = true;

                } catch (NumberFormatException e) {
                    System.out.println("This is not a valid number!");
                }
            }

            // Calculate age
            int age = LocalDate.now().getYear() - birthYear;

            // Print age
            System.out.println("You are, or will be, " + age + " years old");

            // Close scanner
            scanner.close();
        }
}
