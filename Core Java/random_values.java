// Program Purpose:
// This program demonstrates:
// 1. 2D arrays (matrix structure)
// 2. Generating random values using Math.random()
// 3. Nested loops for matrix traversal
// 4. Filling and printing array elements

public class random_values {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating a 2D array (3 rows, 4 columns)
        int num[][] = new int[3][4];

        // Outer loop → controls rows
        for (int i = 0; i < 3; i++) {

            // Inner loop → controls columns
            for (int j = 0; j < 4; j++) {

                // Generate random number between 0 to 9
                num[i][j] = (int)(Math.random() * 10);

                // Print current element
                System.out.print(num[i][j] + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}