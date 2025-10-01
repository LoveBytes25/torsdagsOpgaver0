package Task2;

public class Main {
    public static void main(String[] args) { // 2.b Main class with main method
        Cafe bastard = new Cafe(); // 2.g Create Cafe instance
        bastard.loadMenuData(); // 2.g Call loadMenuData() method on Cafe instance

        // 2.h Print all elements in menu from instance
        for (String menu : bastard.getMenu()) {
            System.out.println(menu);
        }

    }
}
