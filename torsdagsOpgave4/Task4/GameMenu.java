import java.util.ArrayList;

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
}