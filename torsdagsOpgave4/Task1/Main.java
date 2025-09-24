public class Main{ // Client class main 1.a
	public static void main(String[] args){
		Team team1 = new Team("The Royal Coders"); // 1.g Instantiate Team class

		team1.setRank(5); // 1.i Set rank of team1 to 5. 


		String[] teamName = {"Team Null", "Git Gud", "Runtime Terror", "The non-founders", "Stack Overflowers"}; // Make array of team names for loop later
		Team[] teams = new Team[5]; // Array to hold all the teams
		for(int i = 0; i < 5; i++){ // 1.k Create 5 additional Team instances and add them to array and print
			teams[i] = new Team(teamName[i]);
			teams[i].setRank(i);
		}

		for (int i = 0; i < teams.length; i++){ // 1.k continued, print out teams using toString() method 
			System.out.println(teams[i].toString());
		}

		team1.addPlayer("Kojo"); // 1.i Call method by adding player to team
		System.out.print(team1.toString()); // 1.m Test if the new toString() method works: 

	}
}