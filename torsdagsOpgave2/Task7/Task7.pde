void setup(){
  printNumber(10); // Test
}


void printNumber (int a) { // Print number 
  println(a);
  int b = a-1; // Assign new a value to variable b

  if (b < 0) {
    println("Done!"); // Stop when b < 0. 
  } else {
    printNumber(b); // Call function if b is is bigger than or equal to 0
  }
}
