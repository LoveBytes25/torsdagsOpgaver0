void setup(){
  // Teacher Tine = new Teacher("Tine", 50, true); // Tine object
  Student Kojo = new Student("Kojo", 25, false, 'A'); // Student object of self
  Student Andreas = new Student("Andreas", 25, false, 'A'); // Student object of classmate
  Student Theis = new Student("Theis", 33, false, 'B'); // Student object

  System.out.printf("Student name: %s, Team: %c\n", Kojo.name, Kojo.datamatikerTeam); // print name and team of student
  System.out.printf("Student name: %s, Team: %c", Andreas.name, Andreas.datamatikerTeam); // print name and team of student
  System.out.printf("\nAre %s and %s classmates? " + isClassmates(Kojo,Andreas),Kojo.name, Andreas.name); // check if from same class
  System.out.printf("\nAre %s and %s classmates? " + isClassmates(Kojo,Theis),Kojo.name, Theis.name); // check if from same class (different class)

  boolean KojoAndreas = isClassmates(Kojo,Andreas);
  boolean KojoTheis = isClassmates(Kojo, Theis);
  
  System.out.printf("\n%s and %s %s\n", Kojo.name, Andreas.name, KojoAndreas ? "are classmates" : "are not classmates"); // Print are classmates if true
  System.out.printf("%s and %s %s\n", Kojo.name, Theis.name, KojoTheis ? "are classmates" : "are not classmates"); // Print are classmates if true

}

boolean isClassmates(Student student1, Student student2){ // Check if 2 students are classmates
  return student1.datamatikerTeam == student2.datamatikerTeam;
}
