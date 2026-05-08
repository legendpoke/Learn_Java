// Types of errors:
// 1) Compile-time error: code syntax is wrong, such as writing "Print" instead of "print".
// 2) Runtime error: the program compiles but crashes while running.
// 3) Logic error: the program runs, but the output is not what we expected.
// Runtime errors are called exceptions, and Java lets us handle them.
// Exception is also a class.

public class exceptions {
    public static void main(String[]args){
        int i = 0; // Used to demonstrate an ArithmeticException.
        //int i = 2;
        int j = 0;
        // If an exception is not handled, the remaining code will not execute.
        // try and catch are used to handle exceptions and continue the program.
        // If an exception occurs, the catch block runs.
        // If no exception occurs, only the try block runs.

        int nums[] = new int[5];

        try{
            j = 13/i;
        }// Use a specific catch block for each exception type when needed.
        catch(ArithmeticException e){
            // The exception object can also be printed.
            System.out.println("the value is wrong.." + " : " + e);
        }

        // Another try-catch block for array index errors.
        try{
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the value or limit in array is wrong.." + " : " + e);
        }
        // Exception is the parent class of most exception types.
        String str = "dhruv";
        try{
            System.out.println(str.length());
        }
        catch(Exception e){
            System.out.println("thier is error in the string" + " : " + e);

        }
        System.out.println(j);
        System.out.println("bye");
    }
}
