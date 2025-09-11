void setup(){
  
  divisible(3); // Call to see if it works
}

void divisible (int a){ // Print i when i is divisible by a
    for (int i = 1; i < 100; i++){
      if (i % a == 0){
        println(i);
      }
    }
  }
