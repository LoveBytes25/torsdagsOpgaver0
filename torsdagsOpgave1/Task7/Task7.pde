// Task 7

// 7.a + 7.b
int input = -20;

if (input > 0) {
  for (int i = 0; i < input; i++) {
    if (i == 6) {
      println("six");
    } else if ((input/2==i) || (input/2==-i)) {
      println("HALF!");
    }
  }
} else {
  for (int i = 0; i >= input; i--) {
    if (i == -6) {
      println("negative six");
    }
    if ((input/2==i) || (input/2==-i)) {
      println("HALF!");
    }
  }
}
