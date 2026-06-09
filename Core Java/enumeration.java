// Program Purpose:
// This program demonstrates:
// 1. Enum usage
// 2. Enum methods (ordinal, values, getClass)
// 3. Conditional statements with enum
// 4. Switch-case with enum
// 5. Enum as a special class

// Enum type definition.
// Enum is a special type used to define fixed constants.
enum status {

    // Enum constants (fixed predefined values).
    running,
    failed,
    pending,
    success;

    // Enum constants are named fixed values.
    // Enum cannot extend any other class because it already extends java.lang.Enum.
}

public class enumeration {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Assigning enum constant to a variable.
        status s = status.running;

        // Prints the enum constant name.
        System.out.println(s);

        // Another enum constant.
        status s1 = status.failed;

        // ordinal() returns the index position of the enum constant.
        System.out.println(s1.ordinal());

        // values() returns an array of all enum constants.
        status[] s3 = status.values();

        // Looping through all enum values.
        for (int i = 0; i < s3.length; i++) {

            // Printing each enum constant.
            System.out.println(s3[i]);
        }

        // Conditional statements using enum.
        status s4 = status.success;

        // Comparing enum values using ==
        if (s4 == status.running) {
            System.out.println("all good");
        } else if (s4 == status.pending) {
            System.out.println("wait few minutes");
        } else if (s4 == status.failed) {
            System.out.println("try again");
        } else {
            System.out.println("all done");
        }

        // Switch-case with enum.
        status s5 = status.pending;

        switch (s5) {

            case running:
                System.out.println("all good");
                break;

            case failed:
                System.out.println("try again");
                break;

            case pending:
                System.out.println("waiting...");
                break;

            case success:
                System.out.println("done");
                break;
        }

        // Prints the superclass of the enum class.
        System.out.println(s.getClass().getSuperclass());
    }
}