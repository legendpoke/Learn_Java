// Program Purpose:
// This program demonstrates the use of nested for loops.
// The outer loop prints numbers from 1 to 10.
// For each outer-loop number, the inner loop prints all numbers smaller than it.

public class ForLoopExample {

    // The main() method is where program execution begins.
    public static void main(String[] args) {

        // Outer loop:
        // Starts with i = 1 and increases i by 1 after each iteration.
        // The loop continues as long as i is less than or equal to 10.
        //for(initialization; condition; update)
        for (int i = 1; i <= 10; i++) {

            // Prints the current value of i.
            System.out.println(i);

            // Inner loop:
            // Starts with j = 1.
            // Runs until j becomes equal to i.
            // Therefore, it prints all numbers smaller than the current value of i.
            for (int j = 1; j < i; j++) {

                // Prints the current value of j.
                System.out.println(j);
            }
        }
    }
}