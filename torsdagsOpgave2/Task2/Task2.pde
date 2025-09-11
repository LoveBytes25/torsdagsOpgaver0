// 2.a

boolean happy = true;

 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
   
   println(sumOfTwo(3,10)); // Test 2.b
   println(returnToUppercase("Kage!")); // Test 2.c
   println(isFirstLetterUpper("Kage...")); // Test 2.d
}

boolean iAmHappy(){; //Not sure about this one... 
  return happy;      //but it looks correct
}

// 2.b
// Method returns sum of two integers
int sumOfTwo (int a, int b){
  return a + b;
}

// 2.c 
String returnToUppercase(String word){
  return word.toUpperCase(); // built-in function
}

// 2.d 
// Function returns true or false depending on string
boolean isFirstLetterUpper (String word){
  if (word.length() == 0){
    return false; // Handles a string with no letters
  }
  char firstLetter = word.charAt(0); // Finds first letter in string
  return Character.isUpperCase(firstLetter); // Tests if letter is uppercase
}
