// Task 1

void setup(){ // 1.a
 helloFromMethod(); 
 stringToString ("ayy");
 stringFromName("kage",20);
}

void helloFromMethod (){ // 1.b
  println("Hello from the method");
}

// Prints string that gets put into it
void stringToString (String a) { // 1.c 
  String message = a;
  println(a);
}

// 1.d 
// prints string based on name and age with placeholders
void stringFromName (String name, int age){
  System.out.printf("My name is %s, I am %d years old", name, age);
} 
// %s saves a string, %d saves an integer 
