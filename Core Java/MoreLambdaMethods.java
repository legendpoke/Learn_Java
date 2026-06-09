// Program Purpose:
// This program demonstrates:
// 1. Functional Interface
// 2. Lambda expression with multiple parameters
// 3. Returning values using lambda
// 4. Replacing traditional class implementation with lambda

// Functional interface with one abstract method
@FunctionalInterface
interface Addition {

    // Method that takes two integers and returns their sum
    int add(int i, int j);
}

public class MoreLambdaMethods {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // =========================
        // Lambda expression implementation
        // =========================

        // Lambda replaces the need for a separate class implementation
        Addition obj = (i, j) -> {

            // Returning sum of two numbers
            return i + j;
        };

        // Calling lambda-based method
        int result = obj.add(123, 1234);

        // Printing result
        System.out.println(result);
    }
}