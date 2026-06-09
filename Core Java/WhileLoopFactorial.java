// Program Purpose:
// This program calculates the factorial of 5 using a while loop.
//
// Factorial Formula:
// 5! = 5 × 4 × 3 × 2 × 1 = 120

public class WhileLoopFactorial {

    // The main() method is where program execution starts.
    public static void main(String[] args) {

        // Variable used as a counter for the loop.
        // It starts from 1 because factorial multiplication begins with 1.
        int i = 1;

        // Stores the factorial result.
        // Initialized to 1 because multiplying by 1 does not change the result.
        int fact = 1;

        // The loop continues as long as i is less than or equal to 5.
        while (i <= 5) {

            // Multiplies the current value of fact by i
            // and stores the updated result back into fact.
            fact = i * fact;

            // Increases the value of i by 1 for the next iteration.
            i = i + 1;
        }

        // Prints the final factorial value.
        System.out.println(fact);
    }
}