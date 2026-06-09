// Program Purpose:
// This program demonstrates:
// 1. Functional Interface
// 2. Anonymous class implementation of interface
// 3. Implementation of interface using a class
// 4. Polymorphism with interfaces

// A functional interface is an interface with exactly one abstract method.
// If more than one abstract method is added, compiler throws an error.
@FunctionalInterface
interface Displayable {

    // Single abstract method (SAM)
    void show();
}

// A normal class implementing the interface.
class DisplayMessage implements Displayable {

    // Implementation of abstract method
    public void show() {
        System.out.println("in display message show");
    }
}

public class FunctionalInterfaceExample {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // =========================
        // 1. Anonymous class
        // =========================

        // Creating interface object using anonymous class
        Displayable obj = new Displayable() {

            // Overriding abstract method
            public void show() {
                System.out.println("in show");
            }
        };

        // =========================
        // 2. Normal class object
        // =========================

        DisplayMessage obj1 = new DisplayMessage();

        // =========================
        // 3. Interface reference with class object (Polymorphism)
        // =========================

        Displayable obj2 = new DisplayMessage();

        // Calling methods
        obj.show();   // anonymous class implementation
        obj1.show();  // DisplayMessage implementation
        obj2.show();  // DisplayMessage implementation via interface reference
    }
}