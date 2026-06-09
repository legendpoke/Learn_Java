// Program Purpose:
// This program demonstrates:
// 1. Abstract classes
// 2. Abstract methods
// 3. Inheritance
// 4. Method overriding
// 5. Runtime polymorphism

// An abstract class acts as a blueprint for child classes.
// Objects cannot be created directly from an abstract class.
abstract class bus {

    // public void drive(){
    // The comments below explain why abstract methods are used:
    //
    // Abstract means the behavior is declared but not defined here.
    // For example, a bus class can declare drive(), and a child class
    // can define how it drives.
    //
    // Before using an abstract method, declare it in the parent class.
    //
    // A class with an abstract method must also be abstract.
    //
    // An abstract class can contain both abstract and non-abstract methods.
    //
    // A concrete class is a normal child class that implements
    // the abstract methods.
    // }

    // Abstract method declaration.
    // No implementation is provided here.
    // Any child class must implement this method.
    public abstract void drive();

    // A normal (concrete) method with implementation.
    // Child classes automatically inherit this method.
    public void playmusic() {
        System.out.println("playing music");
    }
}

// Child class that extends the abstract class.
class roadways extends bus {

    // Provides the implementation of the abstract method drive().
    public void drive() {
        System.out.println("driving..");
    }
}

public class AbstractKeyword {

    // The main() method is the entry point of the program.
    public static void main(String[] args) {

        // bus obj = new bus();
        // Invalid because abstract classes cannot be instantiated.

        // Parent reference storing a child object.
        // Demonstrates runtime polymorphism.
        bus obj = new roadways();

        // Calls the overridden drive() method of roadways.
        obj.drive();

        // Calls the inherited playmusic() method from bus.
        obj.playmusic();
    }
}