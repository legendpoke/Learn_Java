// Program Purpose:
// This program demonstrates:
// 1. Types of programming errors
// 2. Exception handling using try-catch
// 3. Multiple exception handling blocks
// 4. Specific vs general exception handling
// 5. Program continuation after exceptions

public class exceptions {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Types of errors in programming:

        // 1) Compile-time error:
        // Happens when syntax is wrong.
        // Example: writing "Print" instead of "print"

        // 2) Runtime error:
        // Program compiles but crashes during execution.
        // These are called exceptions in Java.

        // 3) Logic error:
        // Program runs but gives incorrect output.

        int i = 0; // Used to demonstrate ArithmeticException.
        int j = 0;

        // Array with 5 elements (index 0 to 4).
        int nums[] = new int[5];

        // =========================
        // TRY-CATCH BLOCK 1
        // =========================
        try {

            // This line causes division by zero error.
            j = 13 / i;
        }

        catch (ArithmeticException e) {

            // Handles division by zero error.
            System.out.println("the value is wrong.. : " + e);
        }

        // =========================
        // TRY-CATCH BLOCK 2
        // =========================
        try {

            // Valid index access
            System.out.println(nums[1]);

            // Invalid index access (causes exception)
            System.out.println(nums[5]);
        }

        catch (ArrayIndexOutOfBoundsException e) {

            // Handles invalid array index access.
            System.out.println("the value or limit in array is wrong.. : " + e);
        }

        // =========================
        // TRY-CATCH BLOCK 3
        // =========================

        String str = "dhruv";

        try {

            // Valid operation: returns length of string
            System.out.println(str.length());
        }

        catch (Exception e) {

            // General exception handler (catches any exception type)
            System.out.println("there is error in the string : " + e);
        }

        // Final output values
        System.out.println(j);

        // Program continues even after exceptions
        System.out.println("bye");
    }
}