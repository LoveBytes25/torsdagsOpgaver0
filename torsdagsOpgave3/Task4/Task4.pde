// 4.b/4.h Add circle instances
Circle[] circles = new Circle[10];


void setup(){ // 4.a Add setup function
  size(800,800);
  
  Circle test = new Circle(40f, 80f); // 4.e Create new circle object'
  test.display(); // 4.g Test circle object
  
  for (int i = 0; i < circles.length; i++){ //4.i+4j Instantiate Circles using a loop
    circles[i] = new Circle(i*20+50, height-50*i);
  }
}

void draw(){
  for (Circle circle : circles){ // 4.i Test new method with for-each loop
    fill(255,0,0);
    circle.display();
    circle.move(250,0);
  }
}
