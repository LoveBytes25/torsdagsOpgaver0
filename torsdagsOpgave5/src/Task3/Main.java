package Task3;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Room classroom = new Room(16, 10); // 3.g Instantiate 3 different rooms
        Room bathroom = new Room(6, 0); // 3.g
        Room kitchen = new Room(6, 2); // 3.g
        Room atrium = new Room(26, 18); // For testing purposes
        Room corridor = new Room(12, 6); // For testing purposes
        Room lobby = new Room(20, 8); // For testing purposes
        Room hotelRoom = new Room(6, 2); // For testing purposes


        // 3.h Add Room instances to a Building collection
        ArrayList<Room> rooms = new ArrayList<>(); // Initialize rooms arraylist
        rooms.add(classroom);
        rooms.add(bathroom);
        rooms.add(kitchen);

        // 3.i Instantiate new building with the rooms
        Building school = new Building(rooms, 4);


        // ---------- Testing ---------- //
        // For testing methods created in 3.j and 3.k

        ArrayList<Room> fancyRooms = new ArrayList<>(); // Create new arraylist for testing
        fancyRooms.add(atrium);
        fancyRooms.add(corridor);
        fancyRooms.add(lobby);
        fancyRooms.add(hotelRoom);

        // Typical building:
        Building normalHotel = new Building(fancyRooms, 24);
        Building anormalSchool = new Building(rooms, 1);

        // Test countLampsInBuilding()
        System.out.println(countLampsInBuilding(normalHotel)); // Expected output: 64
        System.out.println(countLampsInBuilding(anormalSchool)); // Expected output: 28

        // Test countWindowsInBuilding()
        System.out.println(countWindowsInBuilding(normalHotel)); // Expected output: 34
        System.out.println(countWindowsInBuilding(anormalSchool)); // Expected output: 12

        // Test countRoomsInBuilding()
        System.out.println(countRoomsInBuilding(normalHotel)); // Expected output: 4
        System.out.println(countRoomsInBuilding(anormalSchool)); // Expected output: 3

        // Test isNormal()
        System.out.println(isNormal(normalHotel)); // Expected output: False, since there are more floors (24) than rooms (4)
        System.out.println(isNormal(anormalSchool)); // Expected output: True, since there are more rooms (3) than floors (1)
    }

    // 3.j Write method countLampsInBuilding with parameter of type Building and return type integer
    public static int countLampsInBuilding(Building b) {
        int totalLamps = 0;

        for (Room room : b.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }

        return totalLamps;
    }

    // 3.j
    public static int countWindowsInBuilding(Building b){
        int totalWindows = 0;

        for (Room room : b.getRooms()){
            totalWindows += room.getNumberOfWindows();
        }

        return totalWindows;
    }

    // 3.j
    public static int countRoomsInBuilding(Building b){
        return b.getRooms().size(); // Checks size of arraylist returned in getRooms() method
    }

    // 3.k Check if building is normal (number of floors <= number of rooms)
    public static boolean isNormal(Building b){
        return b.getNumberOfFloors() <= countRoomsInBuilding(b);
    }
}
