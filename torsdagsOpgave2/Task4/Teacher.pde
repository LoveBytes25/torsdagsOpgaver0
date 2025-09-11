class Teacher { // Declare class
  String name; // Add instance variables
  int age; 
  boolean IsFemale;
  
  Teacher (String tmpName, int tmpAge, boolean tmpIsFemale){
    name = tmpName;
    age = tmpAge;
    IsFemale = tmpIsFemale;
  }
  
  void changeName (String newName){ // Change name method 
    name = newName;
  }
}
