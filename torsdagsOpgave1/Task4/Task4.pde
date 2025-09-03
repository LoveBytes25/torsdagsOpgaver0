// 4.a

for (int i = 0; i <= 20; i++) {
  println(i);
}

// 4.b

for (int i = 0; i <= 10; i++) {
  println(2*i);
}

for (int i = 0; i <= 20; i++) {
  if (i % 2 == 0) {
    println(i);
  }
}

// 4.c + 4.d

int start = 5;
String countdown = "";

for (int i = start; i >= 0; i--) {
  if (start == 0) {
    println("Take Off!");
  }
  start-=1;
  
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
