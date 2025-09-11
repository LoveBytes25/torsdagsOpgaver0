// 4.a

// Alle tal mellem 0 og 20 (til og med 20)
for (int i = 0; i <= 20; i++) {
  println(i);
}

// 4.b

// 2-tabellen mellem 0 og 20 (til og med 20)
for (int i = 0; i <= 10; i++) {
  println(2*i);
}

// Anden måde at gøre det på ;)
for (int i = 0; i <= 20; i++) {
  if (i % 2 == 0) {
    println(i);
  }
}

// 4.c + 4.d

// Countdown 
int start = 5;
String countdown = "";

// Print takeoff når vi rammer 0
for (int i = start; i >= 0; i--) {
  if (start == 0) {
    println("Take Off!");
  }
  start-=1;
  
  // Print three, two, one i stedet for 3, 2, 1!
  switch(i) {
  case 3:
    countdown = "three";
    println(countdown);
    break;
    
  case 2:
    countdown = "two";
    println(countdown);
    break;

  case 1:
    countdown = "one";
    println(countdown);
    break;
  }
}

// Man kunne helt klart lave det hele i switchen for at gøre det mere læseligt x) 
