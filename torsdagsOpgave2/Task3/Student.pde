class Student { // Declare class
  String name; // Add instance variables
  int age;
  boolean isFemale;
  char datamatikerTeam;


  Student (String tmpName, int tmpAge, boolean tmpIsFemale, char tmpDatamatikerTeam) { // Constructor
    name = tmpName;
    age = tmpAge;
    isFemale = tmpIsFemale;
    datamatikerTeam = tmpDatamatikerTeam;
  }

  Student (String tmpName, char tmpDatTeam) {
    name = tmpName;
    datamatikerTeam = tmpDatTeam;
  }
}
