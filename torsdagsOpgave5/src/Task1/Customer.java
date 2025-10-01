package Task1;

public class Customer { // 1.a Create a class
    private String firstName;
    private String lastName;
    private String username;
    private int id = counter; // 1.c Initialize id from counter
    private static int counter;


    public Customer (String name, String username){ // 1.b Create constructor
        this.firstName = name;
        this.username = username;
        counter++; // 1.c Increment counter every time constructor is called
    }

    public String toString() { // 1.d Create toString() method
        return "-----Kundedetaljer-----\n" +
                "Navn: " + this.firstName + " " + this.lastName + "\n" +
                "Brugernavn: " + this.username;
    }

    public String getFirstName(){ // 1.d Add getters and setters
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUsername(){
        return this.username;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setUsername(String userName){
        this.username = userName;
    }


}
