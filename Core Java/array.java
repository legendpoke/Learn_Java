// Program Purpose:
// This program demonstrates how to create an array,
// access elements using indexes, and update array values.

public class array {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates an integer array and stores four values in it.
        // The values are stored at indexes 0, 1, 2, and 3.
        int num[] = {3, 4, 5, 6};

        // Prints the value stored at index 0.
        // Output: 3
        System.out.println(num[0]);

        // System.out.println(num[1]);
        // Output: 4

        // System.out.println(num[2]);
        // Output: 5

        // System.out.println(num[3]);
        // Output: 6

        // Updates the value stored at index 1.
        // The old value (4) is replaced with 8.
        num[1] = 8;

        // Prints the updated value at index 1.
        // Output: 8
        System.out.println(num[1]);
    }
}