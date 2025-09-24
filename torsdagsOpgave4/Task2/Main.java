import java.util.Scanner;

class Main {
	public static void main(String[] args){ // 2.a Create Main class with main() method
		System.out.println("Please type your name"); // 2.b Printing message to user

		Scanner sc = new Scanner(System.in); // 2.c Instantiate scanner object
		String name = sc.nextLine(); // 2.d Save input from scanner in a variable

		System.out.println("Greetings " + name + "... Please type your age"); // 2.e Greet user and ask for age
		int age = sc.nextInt(); // 2.f Save age entered by user in a variable

		System.out.println("You are " + age + " years old"); // 2.g Print user's age

		int ageUntilRetirement = 67 - age; // 2.h Save new variable and print age until retirement
		System.out.println("You have " + ageUntilRetirement + " years until retirement");




	}
}