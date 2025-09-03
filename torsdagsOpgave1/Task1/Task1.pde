// Torsdagsopgave 1 - control structures

String month = "Januar"; // 1.a
int days; // 1.a 

switch (month){ // 1.b
  case("Januar"):
  case("Marts"):
  case("Maj"):
  case("Juli"):
  case("August"):
  case("Oktober"):
  case("December"):
  days = 31;
  break;
  
  case("April"):
  case("Juni"):
  case("September"):
  case("November"):
  days = 30;
  break;
  
  case("Februar"):
  days = 28;
  break;
  
  default: 
  days = 0;
  break;
}

println(month + " har " + days + " dage");
