package Task3;


import java.util.ArrayList;

public class Building { // 3.d Create class Building with instance variables
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    public Building(ArrayList<Room> rooms, int numOfFloors){ // 3.e Create constructor
        this.rooms = rooms;
        this.numberOfFloors = numOfFloors;
    }

    public ArrayList<Room> getRooms() { // 3.f Create getter and setter methods
        return rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}

