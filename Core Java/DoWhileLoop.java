// Program Purpose:
// This program demonstrates the use of a do-while loop.
// It prints "hi" followed by a number from 1 to 4.

public class DoWhileLoop {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Variable used to control the loop.
        int i = 1;

        // A do-while loop executes its body first,
        // then checks the condition.
        // This guarantees that the loop body runs at least once.
        do {

            // Prints "hi" along with the current value of i.
            System.out.println("hi" + i);

            // Increases the value of i by 1.
            i = i + 1;

        } while (i <= 4);

        // Example:
        // while(i < 1);
        // If this condition were used with i starting at 1,
        // the loop body would still execute once because
        // do-while checks the condition after execution.
    }
}