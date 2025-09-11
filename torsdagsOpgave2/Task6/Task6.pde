void setup(){
  
  divisible(17); // Call to see if it works
}

void divisible (int divisor){ // Print i when i is divisible by a
    for (int i = 1; i < 100; i++){
      if (i % divisor == 0){
        println(i);
      }
    }
  }
