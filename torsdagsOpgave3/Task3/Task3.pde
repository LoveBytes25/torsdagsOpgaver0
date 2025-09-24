// 3.a Declare and initialize a String-array of top 5 rappers
// 3.c Declare and initiliaze String-array of corresponding hits
String[] rappers = {"Kendrick Lamar", "Tupac Shakur", "André 3000", "Biggie", "Eminem"};
String[] hits = {"Not like us", "Keep ya head up", "Hey ya", "Juicy", "Mockingbird"};

// 3.b For loop to print each name in the array, make it look like a numbered list
// For-each loop:
int counter = 1;
for (String rapper : rappers){
  println(counter + ". " + rapper);
  counter++;
}

print("\n");

// For-loop: 
for (int i = 0; i < rappers.length; i++){
  println((i + 1) + ". " + rappers[i]);
}

print("\n");

// 3.d Update code so that it shows the rapper's hit
// For-each loop: 
counter = 1; 
for (String rapper : rappers){
  println(counter + ". " + rapper + " : \"" + hits[counter-1] + "\"");
  counter++;
}

print("\n");

// For-loop: 
for (int i = 0; i < rappers.length; i++){
  println((i+1) + ". " + rappers[i] + " : \"" + hits [i] + "\"");
}
