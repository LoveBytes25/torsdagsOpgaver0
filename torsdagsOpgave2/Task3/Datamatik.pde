void setup(){
  Teacher Tine = new Teacher("Tine", 50, true); // Tine object
  Student Kojo = new Student("Kojo", 25, false, 'A'); // Student object of self
  Student Andreas = new Student("Andreas", 25, false, 'A'); // Student object of classmate
  
  println(Tine.name); //Print name of teacher
  
  System.out.printf("Student name: %s, Team: %c\n", Kojo.name, Kojo.datamatikerTeam); // print name and team of student
  System.out.printf("Student name: %s, Team: %c", Andreas.name, Andreas.datamatikerTeam); // print name and team of student
}
