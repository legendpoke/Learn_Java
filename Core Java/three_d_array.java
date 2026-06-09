// Program Purpose:
// This program demonstrates a 3D array.
// It creates a 3 × 4 × 5 integer array, fills it with random numbers,
// prints all the values, and then accesses some specific elements.

public class three_d_array {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates a 3D array.
        //
        // Dimension 1: 3 blocks (layers)
        // Dimension 2: 4 rows in each block
        // Dimension 3: 5 columns in each row
        int num[][][] = new int[3][4][5];

        // Traverses each block (layer).
        for (int i = 0; i < 3; i++) {

            // Traverses each row of the current block.
            for (int j = 0; j < 4; j++) {

                // Traverses each column of the current row.
                for (int k = 0; k < 5; k++) {

                    // Generates a random integer from 0 to 99
                    // and stores it in the current position.
                    num[i][j][k] = (int)(Math.random() * 100);

                    // Prints the current element.
                    System.out.print(num[i][j][k] + " ");
                }

                // Moves to the next row after printing 5 values.
                System.out.println();
            }

            // Uncommenting the line below would add a blank line
            // between blocks (layers).
            // System.out.println();
        }

        // Accesses and prints specific elements from the 3D array.
        System.out.println(num[0][0][0]);
        System.out.println(num[1][0][0]);
        System.out.println(num[0][1][0]);
        System.out.println(num[0][0][1]);
        System.out.println(num[1][1][0]);
        System.out.println(num[1][0][1]);
    }
}