// 1.a Add array as global variable

int[] arr = {28,230,9,310,72};

// 1.b Write method getRandom();
int getRandom(){
  return arr[(int) random(0,arr.length)];
}

// 1.c test in setup method

void setup(){
  println(getRandom());
}
