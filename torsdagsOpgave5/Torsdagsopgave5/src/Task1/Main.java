package Task1;

import java.util.ArrayList;

public class Main{
    static ArrayList<Customer> customers = new ArrayList<>(); // 1.e Instantiate arraylist 'customers'

    public static void main(String[] args) {
        customers.add(new Customer("Kojo", "LoveBytes25")); // Add customer to ArrayList
        printCustomers(customers); // 1.f Test printCustomers() method
    }

    public static void printCustomers (ArrayList<Customer> customers){ // 1.f Method printCustomers() to show all customers in list
        for (Customer c : customers){
            System.out.println(c.toString());
        }
    }
}