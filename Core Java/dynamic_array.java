// Program Purpose:
// This program demonstrates:
// 1. Dynamic array creation
// 2. Default values in arrays
// 3. Accessing array elements using indexes
// 4. Updating array elements

public class dynamic_array {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates an integer array with space for 4 elements.
        // Java automatically initializes all elements to 0.
        int num[] = new int[4];

        // Prints the value stored at index 0.
        System.out.println(num[0]);

        // Prints the value stored at index 1.
        System.out.println(num[1]);

        // Prints the value stored at index 2.
        System.out.println(num[2]);

        // Prints the value stored at index 3.
        System.out.println(num[3]);

        // Updates the value stored at index 1.
        num[1] = 8;

        // Updates the value stored at index 2.
        num[2] = 9;

        // Updates the value stored at index 3.
        num[3] = 10;

        // Prints the value stored at index 0.
        System.out.println(num[0]);

        // Prints the updated value stored at index 1.
        System.out.println(num[1]);

        // Prints the updated value stored at index 2.
        System.out.println(num[2]);

        // Prints the updated value stored at index 3.
        System.out.println(num[3]);
    }
}