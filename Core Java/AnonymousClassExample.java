// Program Purpose:
// This program demonstrates an Anonymous Class.
// An anonymous class is a class without a name.
// It is used when a class implementation is needed only once.

// Anonymous means it does not have a name.
class GreetingPrinter {

    // Normal method of the GreetingPrinter class.
    public void show() {
        System.out.println("in greeting printer show");
    }
}

public class AnonymousClassExample {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates an anonymous subclass of GreetingPrinter
        // and immediately creates its object.
        //
        // The anonymous class overrides the show() method.
        GreetingPrinter obj = new GreetingPrinter() {

            // This method belongs to the anonymous class.
            // It overrides the original show() method.
            public void show() {

                // New implementation of show().
                System.out.println("in new show");
            }
        };

        // Calls the overridden method of the anonymous class,
        // not the original method from GreetingPrinter.
        obj.show();
    }
}