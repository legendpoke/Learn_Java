// import java.io.BufferedReader;
// This import is commented out.
// BufferedReader can be used to read text input efficiently.

// Import required for handling input/output exceptions.
import java.io.IOException;

// import java.io.InputStreamReader;
// This import is commented out.
// InputStreamReader converts byte streams into character streams.

import java.util.Scanner;

// Program Purpose:
// This program takes an integer input from the user
// and then displays the entered number on the screen.

public class user_input {

    // The main() method is the starting point of the program.
    //
    // throws IOException:
    // Allows the program to pass any input/output exception
    // to the JVM instead of handling it inside the code.
    //
    // throws NumberFormatException:
    // Used when a string cannot be converted into a number.
    public static void main(String[] args) throws NumberFormatException, IOException {

        // Displays a message asking the user to enter a number.
        System.out.println("enter a number:");

        // InputStreamReader in = new InputStreamReader(System.in);
        // Creates a character stream connected to keyboard input.
        // This line is commented out.

        // BufferedReader bf = new BufferedReader(in);
        // Wraps InputStreamReader to read input more efficiently.
        // This line is commented out.

        // Creates a Scanner object for reading user input from the keyboard.
        // Scanner is one of the easiest ways to take input in Java.
        Scanner sc = new Scanner(System.in);

        // Reads an integer value entered by the user
        // and stores it in the variable num.
        int num = sc.nextInt();

        // Displays the value entered by the user.
        System.out.println(num);

        // Releases the resources used by the Scanner object.
        sc.close();
    }
}