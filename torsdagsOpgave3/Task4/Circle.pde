// 4.c Write Circle class

class Circle {
  float xposition; // 4.c Instance variables
  float yposition;

  Circle (float xPos, float yPos) { // 4.d Add constructor
    this.xposition = xPos;
    this.yposition = yPos;
  }

  void display() { // 4.f Create ellipse at xposition, yposition
    ellipse(xposition, yposition, width/2-40, height/2-90);
  }

  void move(float xChange, float yChange) { // 4.k move circle
    xposition = xposition + xChange;
    yposition = yposition + yChange;
    ellipse(xposition, yposition, 50, -50);
  }
}
