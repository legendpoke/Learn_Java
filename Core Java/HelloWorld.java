// Program Purpose:
// This program prints a greeting message and displays the sum of two numbers.

// A class is a blueprint that contains data and methods.
// The file execution starts from the main() method inside this class.
class HelloWorld {

    // main() is the entry point of a Java application.
    // The JVM (Java Virtual Machine) starts executing the program from here.
    public static void main(String a[])
    {
        // Displays the text "hello world" on the console.
        System.out.println("hello world");

        // Stores the integer value 3 in the variable num1.
        int num1 = 3;

        // Stores the integer value 4 in the variable num2.
        int num2 = 4;

        // Adds num1 and num2, then prints the result.
        // Output: 7
        System.out.println(num1 + num2);
    }
}