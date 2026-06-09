// Program Purpose:
// This program demonstrates:
// 1. Need of Interface in Java
// 2. Loose coupling (important OOP principle)
// 3. Polymorphism using interfaces
// 4. Multiple implementations of same contract
// 5. Dependency inversion (high-level class depends on interface)

// Interface defines a common contract for all computers
interface Computer {

    // Every computer must implement this method
    void code();
}

// Laptop implementation of Computer interface
class LaptopComputer implements Computer {

    // Laptop-specific implementation
    public void code() {
        System.out.println("compile ,run,code");
    }
}

// Desktop implementation of Computer interface
class DesktopComputer implements Computer {

    // Desktop-specific implementation (faster performance)
    public void code() {
        System.out.println("compile,run: faster");
    }
}

// Developer class depends on abstraction (interface), not concrete classes
class Developer {

    // Method accepts any object that implements Computer interface
    public void devapp(Computer computer) {

        // Calls the specific implementation at runtime
        computer.code();

        System.out.println("develop app");
    }
}

public class NeedOfInterface {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Developer object
        Developer obj = new Developer();

        // Using DesktopComputer implementation
        Computer obj1 = new DesktopComputer();
        obj.devapp(obj1);

        // Using LaptopComputer implementation
        Computer obj2 = new LaptopComputer();
        obj.devapp(obj2);
    }
}