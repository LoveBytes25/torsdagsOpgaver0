// 2.a Write method printPartOfWord with 3 parameters

void printPartOfWord(String fullWord, int subWordStart, int subWordEnd) {
  println(fullWord.substring(subWordStart, subWordEnd));
}

// 2.b Call method from setup
void setup() {
  printPartOfWord("Piece of cake", 0, 3);
  printPartOfWord("Piece of cake", 0, 4); // First 4 letters
  // printPartOfWord("Piece", 4, 2); // Test error case
  // printPartOfWord("Piece", -2, 3); // Test error case
  betterPrintPartOfWord("Piece of cake", -2, 4); // Test new function
}

// No 2.c??

// 2.d Figure out how to get the function call to display the first 4 letters
// of any string
/*
The function call displays the begin index INCLUSIVE but the end index EXCLUSIVE
 so to call the first 4 letters, we'd have to do beginIndex 0 and endIndex 4.
 I've also called it in setup
 */

// 2.e Check what happens if there are negative values being put into the function
// or if start index is higher than end index, and ensure that the method returns
// a fitting error message <>

void betterPrintPartOfWord(String fullWord, int subWordStart, int subWordEnd) {
  if (subWordStart < 0) { // Check negative input
    println("Ooopsie! Start index can't be less than 0");
    return;
  }

  if (subWordEnd < 0) { // Check negative input
    println("Gawd dang it... End index can't be negative :(");
    return;
  }

  if (subWordStart > subWordEnd) { // Checks if start index is larger than end index
    println("Can't start from the beginning of the end of the word bro");
    return;
  }

  if (subWordEnd > fullWord.length()) {
    println("That's... out of bounds, try an end index that isn't larger than the length of the damn string");
    return;
  }

  println(fullWord.substring(subWordStart, subWordEnd));
}
