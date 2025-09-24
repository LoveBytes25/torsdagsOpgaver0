import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object
    Scanner sc = new Scanner(System.in);

        // use hasNextDouble to check if input is numeric, 
        // if so...
    if (sc.hasNextDouble()){
        double userGuessDouble = sc.nextDouble(); // Read user input
        int userGuess = (int) userGuessDouble; // Since the random number is an integer, I have to makee sure the double is too

        if (userGuessDouble != userGuess){ // Check if the number that was typecasted is the same as the original
            System.out.println("Please enter an integer"); // Prompt user to only use integers
            makeAGuess(); // Try again
            return;
        }

        if (userGuess < rnd_number){  // Compare it with the random number
            System.out.println("Too low, try again!");  // Let the user know the result of the comparison
            makeAGuess();  // Let the user try again by calling this method recursively
        } else if (userGuess > rnd_number) {  // Compare it with the random number
            System.out.println("Too high, try again!");  // Let the user know the result of the comparison
            makeAGuess();  // Let the user try again by calling this method recursively
        } else {
            System.out.println("Congratulations, you found the number! The number was: " + rnd_number);
        }

    } else {
        System.out.println("Not a valid number, please enter an enteger between 1 and 100"); // if input was not numeric show an error message and call this method recursively
        sc.next(); // Cancel the input from the scanner 
        makeAGuess();
        }
    }
}