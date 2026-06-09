// Program Purpose:
// This program demonstrates:
// 1. final keyword with variable
// 2. final keyword with method
// 3. final keyword with class
// 4. Compile-time restrictions using final

// A final class cannot be inherited.
// This means no other class can extend class f.
final class f {

    // A final method cannot be overridden in child classes.
    public final void show() {
        System.out.println("show in f");
    }
}

/*
// This would cause an error because class f is final.
// A final class cannot be extended.

class k extends f {

    // This would also cause an error because show() is final.
    public void show() {
        System.out.println("show in k ");
    }
}
*/

public class FinalKeyword {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // A final variable becomes constant after initialization.
        final int num = 8;

        // This is not allowed because final variables cannot be changed.
        // num = 9;

        System.out.println(num);

        // Creating an object of final class f.
        f obj = new f();

        // Calling final method show().
        obj.show();
    }
}