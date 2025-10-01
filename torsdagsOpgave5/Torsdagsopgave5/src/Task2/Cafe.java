package Task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    ArrayList<String> getMenu(){ // 2.b Getter method for list
        return this.coffeeMenu;
    }

    public void loadMenuData(){ // 2.c Add loadMenuData() method
        try {
            File file = new File("data/coffees.txt");
            Scanner sc = new Scanner(file); // 2.d Add file instance on scanner object
            while(sc.hasNextLine()){ // 2.e Add a while-loop and add menu to ArrayList
                coffeeMenu.add(sc.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }



}
