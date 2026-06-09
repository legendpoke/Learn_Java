// Program Purpose:
// This program prints all the values stored in an array
// using a for loop.

public class all_array_values {

    // The main() method is the entry point of the program.
    public static void main(String[] args) {

        // Creates an integer array containing six values.
        int num[] = {1, 2, 3, 4, 5, 6};

        // The loop starts from index 0 and continues until index 5.
        // Each iteration accesses one array element and prints it.
        for (int i = 0; i < 6; i++) {

            // Prints the array element stored at the current index.
            System.out.println(num[i]);
        }
    }
}