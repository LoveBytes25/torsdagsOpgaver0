// Method to sort an integer array from lowest to highest

// First create an array of unordered integers:
int[] unorderedInts = {9, 4, 2, 7, 18, 48, 34, -2, -347, 0};

void setup() {
  // Original array to see what it looked like in the beginning
  println("Original array:");
  println(unorderedInts);

  selectionSort(unorderedInts);
  
  println("Sorted array:");
  println(unorderedInts);

  /*
   Googled Sorting Algorithms and found "Selection Sort". It works by comparing 2
   elements throughout the array and swapping if the first one is smaller than the second
   */
}

void selectionSort (int[] arr) {
  for (int i = 0; i < arr.length - 1; i++) { // Look at entire array minus last value
    int maxIndex = i; // Find the highest value in the subArray
    for (int j = i + 1; j < arr.length; j++) {
      if (arr[j] > arr[maxIndex]) { // Compare subsequent values and assign Index with highest value to maxIndex
        maxIndex = j;
      }
    }

    int tmpMax = arr[maxIndex]; // Use helper variable to save the highest found value
    arr[maxIndex] = arr[i]; // Swap around highest and lowest value
    arr[i] = tmpMax; // Swap around highest and lowest value
  }
}
