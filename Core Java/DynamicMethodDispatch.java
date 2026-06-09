// Program Purpose:
// This program demonstrates:
// 1. Inheritance
// 2. Method Overriding
// 3. Runtime Polymorphism
// 4. Dynamic Method Dispatch

// Parent class.
class ParentDisplay {

    // Method that can be overridden by child classes.
    public void show() {
        System.out.println(" A show");
    }
}

// First child class inheriting from ParentDisplay.
class FirstChildDisplay extends ParentDisplay {

    // Overrides the show() method of ParentDisplay.
    public void show() {
        System.out.println("in b show");
    }
}

// Second child class inheriting from ParentDisplay.
class SecondChildDisplay extends ParentDisplay {

    // Overrides the show() method of ParentDisplay.
    public void show() {
        System.out.println("in c show");
    }
}

public class DynamicMethodDispatch {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Dynamic Method Dispatch Example.

        // Parent reference storing a ParentDisplay object.
        ParentDisplay obj = new ParentDisplay();

        // Calls ParentDisplay's show() method.
        obj.show();

        // Parent reference now stores a FirstChildDisplay object.
        // This is possible because FirstChildDisplay inherits ParentDisplay.
        obj = new FirstChildDisplay();

        // Calls FirstChildDisplay's overridden show() method.
        obj.show();

        // Parent reference now stores a SecondChildDisplay object.
        obj = new SecondChildDisplay();

        // Calls SecondChildDisplay's overridden show() method.
        obj.show();
    }
}