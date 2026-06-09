// Program Purpose:
// This program compares three numbers and prints which one is the greatest.

public class GreatestOfThreeNumbers {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Three integer variables whose values will be compared.
        int a = 12;
        int b = 13;
        int c = 16;

        // Checks whether 'a' is greater than both 'b' and 'c'.
        if (a > b && a > c) {

            // Executes when the above condition is true.
            System.out.println("a is greater number");
        }

        // Executes only if the previous condition was false.
        // Checks whether 'b' is greater than both 'a' and 'c'.
        else if (b > a && b > c) {

            // Executes when b is the greatest number.
            System.out.println("b is greater number");
        }

        // Executes when neither a nor b is the greatest.
        // Therefore, c is considered the greatest number.
        else {

            // Prints that c is the greatest number.
            System.out.println("c is greater number");
        }
    }
}