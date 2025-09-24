import java.util.ArrayList;

public class Main{ // 4.e Main client class and main method
	public static void main(String[] args){
		ArrayList<String> actions = new ArrayList<>(); // 4.f Create new arraylist and add 4 strings to the list
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu gameOptions = new GameMenu(actions); // 4.g Instantiate GameMenu class with actions list

		gameOptions.displayMenu(); // 4.i Call displayMenu() method on GameMenu instance

		String userChoice = gameOptions.promptUser(); // 5.d Save the return value in a variable

		int actionNum = Integer.parseInt(userChoice); // 5.g Convert value to an integer so that we can use it in the doAction() method

		doAction(actionNum); // Call method 


	}

	public static void doAction (int action){
		switch(action){ // 5.f 
		case 1: 
			System.out.println("Starting a new game...");
			break;

		case 2: 
			System.out.println("Loading earlier game state...");
			break;

		case 3: 
			System.out.println("Pausing game...");
			break;

		case 4: 
			System.out.println("Ending game...");
			break;

		default:
			System.out.println("Invalid action, please enter a number corresponding to an action");
			break;
		}
	}
	
}