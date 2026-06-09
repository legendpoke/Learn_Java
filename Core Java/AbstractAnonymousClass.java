// Program Purpose:
// This program demonstrates:
// 1. Abstract classes
// 2. Method overriding
// 3. Anonymous inner classes
// 4. Runtime polymorphism

// An abstract class cannot be instantiated directly.
// It is used as a blueprint for other classes.
abstract class AbstractDisplay {

    // An abstract method has no implementation.
    // Any concrete subclass must provide its own implementation.
    public abstract void show();
}

// This class extends the abstract class and provides
// an implementation for the abstract method.
class NormalDisplay extends AbstractDisplay {

    // Provides the implementation of show().
    public void show() {
        System.out.println("in normal display show");
    }
}

public class AbstractAnonymousClass {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Reference of parent type storing an object of child type.
        // This demonstrates runtime polymorphism.
        AbstractDisplay obj = new NormalDisplay();

        // Calls the overridden show() method of NormalDisplay.
        obj.show();

        // Creating an anonymous class object.
        // This creates a new unnamed class that extends AbstractDisplay
        // and immediately creates its object.
        //
        // The class exists only at this location in the code.
        AbstractDisplay obj1 = new AbstractDisplay() {

            // Provides implementation of the abstract method.
            public void show() {
                System.out.println("in new show ");
            }
        };

        // Calls the show() method of the anonymous class.
        obj1.show();
    }
}