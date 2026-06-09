// Program Purpose:
// This program demonstrates a 2D array (matrix).
// It creates a 3 × 4 integer array and prints all its values.

// 2D array example.
public class multi_array {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates a 2D integer array with 3 rows and 4 columns.
        // Since no values are assigned, Java initializes all elements to 0.
        int num[][] = new int[3][4];

        // Outer loop traverses each row.
        for (int i = 0; i < 3; i++) {

            // Inner loop traverses each column of the current row.
            for (int j = 0; j < 4; j++) {

                // Prints the value stored at the current row and column position.
                System.out.print(num[i][j] + " ");
            }

            // Moves the cursor to the next line after printing one complete row.
            System.out.println();
        }
    }
}