// Task 8

size(200, 200);
background(255);

int count = 0; 

while (count < 100){
  // Tilfældige positioner
  float circX = random(width);
  float circY = random(height);
  
  // Tilfældig størrelse
  float size = random(1,width/3);
  
  // Tilfældig farve
  float r = random(255);
  float g = random(255);
  float b = random(255);
  fill(r,g,b);
  
  // Tegn cirkler
  ellipse(circX,circY,size,size);
  
  count++;
}
