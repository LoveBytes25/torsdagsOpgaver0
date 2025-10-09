package Opgave1;

public class ArrayFejl {

        public static void printTreForsteElementer(String[] array) {
            try {
                System.out.println("Første element: " + array[0]);
                System.out.println("Andet element: " + array[1]);
                System.out.println("Tredje element: " + array[2]);
            }
            catch (IndexOutOfBoundsException e){ //2. + 3. Try catch block and error message
                System.out.println("Invalid index, please enter number between 0 and " + array.length);
            }
        }

        public static void main(String[] args) {
            String[] navne1 = {"Anna", "Bob", "Clara", "David"};
            String[] navne2 = {"Eva", "Frank"};

            printTreForsteElementer(navne1);
            printTreForsteElementer(navne2);
        }
    }

    /*
    1: When the method is called with the navne2 array, the method will attempt to
    print the element at index 2. However, the largest index in navne2 is 1, as there are
    only 2 elements within the array. Hence, the IndexOutOfBoundsException.

    4: Code compiles flawlessly now.
     */

