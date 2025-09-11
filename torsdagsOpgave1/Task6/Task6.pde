// Task 6

// 6.a 

int red = color(255,0,0);
int yellow = color(255,222,33);
int green = color(0,255,0);
int off = color(0);

// 6.b

int light1 = red;
int light2 = yellow;
int light3 = green;

// 6.c 

void setup(){
  size(600,600);
  rectMode(CENTER);
  fill(0);
  rect(width/2,height/2,width/3,height-height/6);
}

// 6.d 

void draw (){
  switch(frameCount % 700){
  case 1:
  light1 = red;
  light2 = off; 
  light3 = off;
  break;
  
  case 200:
  light1 = red;
  light2 = yellow;
  light3 = off;
  break;
  
  case 350:
  light1 = off;
  light2 = off; 
  light3 = green;
  break; 
  
  case 600: 
  light1 = off;
  light2 = yellow; 
  light3 = off;
  break;
  }
  
  // 6.e
  fill(light1);
  ellipse(width/2,height/2-150,100,100);
  fill(light2);
  ellipse(width/2,height/2,100,100);
  fill(light3); 
  ellipse(width/2,height/2+150,100,100);
}
