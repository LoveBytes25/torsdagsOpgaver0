void setup(){
  printNumber(10); // Test
}


void printNumber (int num) { // Print number 
  println(num);
  int subOne = num-1; // Assign new a value to variable subOne

  if (subOne < 0) {
    println("Done!"); // Stop when subOne < 0. 
  } else {
    printNumber(subOne); // Call function if subOne is is bigger than or equal to 0
  }
}
