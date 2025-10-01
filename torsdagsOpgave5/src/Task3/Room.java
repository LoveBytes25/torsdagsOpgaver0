package Task3;

public class Room { // 3.a Make Room class
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numOfLamps, int numOfWindows){ // 3.b Create constructor
        this.numberOfLamps = numOfLamps;
        this.numberOfWindows = numOfWindows;
    }

    public int getNumberOfLamps(){ // 3.c Create getter and setter methods
        return this.numberOfLamps;
    }

    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }

    public void setNumberOfLamps(int number){
        this.numberOfLamps = number;
    }

    public void setNumberOfWindows(int number){
        this.numberOfWindows = number;
    }

}
