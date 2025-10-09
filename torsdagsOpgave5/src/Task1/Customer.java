package Task1;

public class Customer { // 1.a Create a class
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 1;


    public Customer (String firstName,String lastName, String username){ // 1.b Create constructor
        setFirstName(firstName);
        setLastName(lastName);
        setUsername(username);
        this.id = counter; // 1.c Initialize id from counter
        counter++; // 1.c Increment counter every time constructor is called
    }

    public String toString() { // 1.d Create toString() method
        return "-----Kundedetaljer-----\n" +
                "ID: " + id + "\n" +
                "Navn: " + this.firstName + " " + this.lastName + "\n" +
                "Brugernavn: " + this.userName;
    }

    public String getFirstName(){ // 1.d Add getters and setters
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUsername(){
        return this.userName;
    }

    public int getId(){
        return this.id;
    }

    public void setFirstName(String firstName){
        if(firstName != null && !firstName.equals("") && firstName.length() > 1) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName){
        if(lastName != null && !lastName.equals("") && lastName.length() > 1) {
            this.lastName = lastName;
        }
    }

    public void setUsername(String userName){
        if(userName != null && !userName.equals("") && userName.length() > 1) {
            this.userName = userName;
        }
    }


}
