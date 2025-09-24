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
	}
	
}