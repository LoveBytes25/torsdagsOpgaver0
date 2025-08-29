String address; // 3.b
int x;
int y;
int sum = x + y; // 3.c Variabel gemmer summen af to heltal
double div = (double) x / y; // 3.d Variabel gemmer division af to heltal
String message = "Her er min adresse: "+address; // 3.e Besked til gruppen

void setup(){ // 4.a - 4.d
  address = "Firskovvej 18";
  x = 1;
  y = 2;
  sum = x + y;
  div = x / (double) y;
  println("Adresse: "+address);
  println("Antal % vi hygger os: "+x);
  println("Vores alko-promille i aften: "+y);
  println("Antal hjerneceller tilbage efter en lang dag: "+sum);
  println("Penge tilbage på kontoen før lønningsdag: "+div);
  
  // 4.e
  address = address + " 2800 Lyngby";
  x = x + 150;
  y = y + 250;
  sum = x + y;
  div = x / (double) y;
  println("Adresse: "+address);
  println("Antal % vi hygger os: "+x);
  println("Vores alko-promille i aften: "+y);
  println("Antal hjerneceller tilbage efter en lang dag: "+sum);
  println("Penge tilbage på kontoen før lønningsdag: "+div); 
  
  // 4.f
  x += 1;
  println("Lang måde at skrive 152 på: "+x);
  y+= 1; 
  println("Lang måde at skrive 253 på: "+y);
  sum += 1;
  println("Lang måde at skrive 404 på: "+sum);
  div += 1;
  println("Lang måde at skrive et sjovt tal på: "+div);
  
  // 4.g
  x += 3;
  println("Lang måde at skrive 155 på: "+x);
  y+= 3; 
  println("Lang måde at skrive 256 på: "+y);
  sum += 3;
  println("Lang måde at skrive 407 på: "+sum);
  div += 3;
  println("Lang måde at skrive et sjovt tal på: "+div);

  // 4.h 
  x -= 1;
  println("Lang måde at skrive 154 på: "+x);
  y -= 1; 
  println("Lang måde at skrive 255 på: "+y);
  sum -= 1;
  println("Lang måde at skrive 406 på: "+sum);
  div -= 1;
  println("Lang måde at skrive et sjovt tal på: "+div);

}
