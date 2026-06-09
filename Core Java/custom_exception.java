// Program Purpose:
// This program demonstrates:
// 1. Custom Exceptions
// 2. Creating user-defined exceptions
// 3. throw keyword
// 4. try-catch blocks
// 5. Exception inheritance

// Custom exception class.
// Every custom checked exception should extend Exception.
class DhruvException extends Exception {

    // Constructor of the custom exception.
    public DhruvException(String string) {

        // Calls the constructor of the parent Exception class
        // and passes the error message.
        super(string);
    }
}

public class custom_exception {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Variable used for division.
        int i = 0;

        // int i = 2;

        // Variable used to store the result.
        int j = 0;

        try {

            // Attempts to divide 10 by i.
            // If i is 0, ArithmeticException occurs.
            j = 10 / i;

            // Checks whether j is 0.
            // If true, a custom exception is thrown.
            if (j == 0); {

                // Creates and throws a custom exception object.
                throw new DhruvException("the error is found");
            }
        }

        // Catches the custom exception.
        catch (DhruvException e) {

            // Recovery logic after the exception occurs.
            j = 18 / 1;

            // Prints the exception message.
            System.out.println("this is the default output" + " : " + e);
        }

        // Prints the final value of j.
        System.out.println(j);
    }
}