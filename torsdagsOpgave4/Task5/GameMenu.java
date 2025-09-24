import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{ // 4.a Create entity class
	private ArrayList<String> actions; // 4.b Add private instance variable ArrayList

	public GameMenu(ArrayList<String> actions){ // 4.c Add consctructor with arraylist as input
		this.actions = actions; // 4.d Assign the received list as an argument to the instance variable
	}

	public void displayMenu(){ // 4.h Create method to display the menu 
		System.out.println("Game menu:");

		for (String action : actions){ 
			System.out.println(action);
		}
	}

	public String promptUser(){ // 5.a Prompt user to type a number corresponding to an action 
		Scanner sc = new Scanner(System.in); // 5.b Create new scanner object

		System.out.println("Type a number to choose an action.");
		// displayMenu();

		String choice = sc.nextLine(); // Save user's input

		return choice; // 5.c Return user's input
	}
}