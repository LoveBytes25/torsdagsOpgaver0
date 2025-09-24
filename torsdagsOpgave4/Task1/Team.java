import java.util.ArrayList;

class Team{ // Entity class 1.b
	private String name; // 1.c 
	private int rank; // 1.d
	private ArrayList<String> players; // 1.e

	public Team(String teamName){ // 1.f Add constructor with team name as parameter
		this.name = teamName;
		this.players = new ArrayList<String>();
	}

	public void setRank(int rank){ // 1.h Create rank setter
		this.rank = rank;
	}

	public String toString(){ // 1.j Add a toString() method
		String result = "Hold: " + name + " Rang: " + rank; // 1.m method so that each player's name gets returned

		if (!players.isEmpty()){
			result += "\nSpillere:";
			for (String player : players){
				result += "\n- " + player;
			}
		}
		return result;
	}

	public void addPlayer(String playerName){ // 1.l Add player to array list wíth method
		this.players.add(playerName);
	}
}