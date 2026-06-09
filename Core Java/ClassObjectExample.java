// Program Purpose:
// This program demonstrates:
// 1. Class creation
// 2. Object creation
// 3. Methods
// 4. Parameters and arguments
// 5. Returning values from methods

// Class example.

// A class is a blueprint used to create objects.
// This class represents a simple calculator.
class SimpleCalculator {

    // This method accepts two integer values,
    // adds them together, and returns the result.
    public int add(int num1, int num2) {

        // Stores the sum of num1 and num2.
        int r = num1 + num2;

        // Sends the result back to the method caller.
        return r;
    }
}

public class ClassObjectExample {

    // The main() method is the entry point of the program.
    public static void main(String[] args) {

        // Creates an object of the SimpleCalculator class.
        SimpleCalculator calculator = new SimpleCalculator();

        // Calls the add() method and stores the returned value.
        int result = calculator.add(4, 5);

        // Prints the returned result.
        System.out.println(result);
    }
}