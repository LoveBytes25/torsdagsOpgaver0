// 7.a Make 3 different arraylists
ArrayList<Integer> intList = new ArrayList<Integer>();
ArrayList<String> strList = new ArrayList<String>();
ArrayList<Boolean> boolList = new ArrayList<Boolean>();

// 7.b print strings from ArrayList
void printStrings(ArrayList<String> listToPrint){
  for (String s : listToPrint){
    println(s);
  }
}

// 7.c Sum integer Arraylist
int sumIntegers(ArrayList<Integer> listToPrint){
  int sum = 0; 
  for (Integer n : listToPrint){
    sum = sum + n;
  }
  return sum;
}

// 7.d Average of integer ArrayList
double averageIntergers(ArrayList<Integer> listToPrint){
  return (double) sumIntegers(listToPrint) / listToPrint.size();
}
