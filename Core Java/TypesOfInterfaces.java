// Program Purpose:
// This program explains different types of interfaces in Java.
// It is purely conceptual and does not execute logic.

public class TypesOfInterfaces {

    public static void main(String[] args) {

        // =====================================================
        // TYPES OF INTERFACES IN JAVA
        // =====================================================

        // 1. NORMAL INTERFACE
        // -----------------------------------------------------
        // An interface that has two or more abstract methods.
        //
        // Example idea:
        // interface A {
        //     void show();
        //     void run();
        // }
        //
        // USE:
        // ✔ When multiple behaviors are required

        // -----------------------------------------------------

        // 2. FUNCTIONAL INTERFACE (SAM Interface)
        // -----------------------------------------------------
        // SAM = Single Abstract Method
        //
        // It contains only one abstract method.
        //
        // Example idea:
        // interface A {
        //     void show();
        // }
        //
        // USE:
        // ✔ Used in Lambda expressions
        // ✔ Used in functional programming style

        // -----------------------------------------------------

        // 3. MARKER INTERFACE
        // -----------------------------------------------------
        // An interface with no methods or fields.
        //
        // Example:
        // interface Serializable { }
        //
        // USE:
        // ✔ Used to mark a class for special behavior
        // ✔ JVM or frameworks detect it at runtime

        // =====================================================
        // NOTE:
        // SAM = Single Abstract Method (important for lambdas)
        // =====================================================
    }
}