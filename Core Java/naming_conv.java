// Program Purpose:
// This program demonstrates:
// 1. Java naming conventions (camel case rules)
// 2. Constructor execution
// 3. Anonymous objects
// 4. Object creation and method calling

// Class following Java naming convention (PascalCase)
class A {

    // Constructor: called automatically when object is created
    public A() {
        System.out.println("object created");
    }

    // Method following camelCase naming convention
    public void show() {
        System.out.println("show");
    }
}

public class naming_conv {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // =========================
        // Anonymous object creation
        // =========================

        // Object is created but NOT stored in a reference variable
        new A();

        // Another anonymous object created and method is called immediately
        new A().show();
    }
}