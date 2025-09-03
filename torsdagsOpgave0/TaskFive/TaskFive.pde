/* 
The code in this sketch will not compile, as it referes to varables which have not yet been declared 
Please complete task 5 to get this to compile.
*/

float circleSize; // 5.a
float numberOfCircles; // 5.b
float x; // 5.c
float y; // 5.c 
int counter; // 5.d
int rowCounter; // 5.d
int r; // 6.a
int g; // 6.a
int b; // 6.a

void setup(){
   size(400,400);
   r = 255; // 6.b
   g = 255; // 6.b
   b = 255; // 6.b
   numberOfCircles = 30;
   circleSize = width/numberOfCircles;
   ellipseMode(CORNER);
  
}
void draw(){
  x = circleSize*counter;
  y = circleSize*rowCounter;
  
  // Un-comment this line after completing step 6.a 
  fill(r,g,b);
   
  ellipse(x,y,circleSize,circleSize);
  
  // Explaining conditional assignments. 
  // First part before the ?-mark, is a conditional. 
  // If this is true, the value after the ?-mark will be assigned. 
  // If not, the last value will.
  counter =  frameCount % numberOfCircles == 0 ? 0 : counter+1;
  rowCounter =  counter==0 ? rowCounter+1:rowCounter;
  
  
  // Explaining the modulus operator
  // Modulus is what is left when you divide one int with another int.
  // 1 % 3 = 1 (3 people can't share 1 apple without cutting it, so 1 apple is left)
  // 2 % 3 = 2
  // 3 % 3 = 0
 
  r = counter == 0? (int) random(255):r;
  g = counter == 0? (int) random(255):g;
  b = counter == 0? (int) random(255):b;
  
}
