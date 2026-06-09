// Program Purpose:
// This program demonstrates a Jagged Array.
// A jagged array is a 2D array where each row can have a different number of columns.
// The program creates a jagged array, fills it with random numbers,
// and prints all the values.

public class jagged_array { // Jagged array: each row can have a different number of columns.

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates a 2D array with 3 rows.
        // The column sizes are not defined yet.
        int num[][] = new int[3][];

        // Creates the first row with 4 columns.
        num[0] = new int[4];

        // Creates the second row with 3 columns.
        num[1] = new int[3];

        // Creates the third row with 2 columns.
        num[2] = new int[2];

        // Traverses each row of the jagged array.
        for (int i = 0; i < num.length; i++) {

            // Traverses each column of the current row.
            for (int j = 0; j < num[i].length; j++) {

                // Generates a random number between 0 and 9
                // and stores it in the current array element.
                num[i][j] = (int)(Math.random() * 10);

                // Prints the generated value.
                System.out.print(num[i][j] + " ");
            }

            // Moves to the next line after printing one row.
            System.out.println();
        }
    }
}