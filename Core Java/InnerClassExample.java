// Program Purpose:
// This program demonstrates:
// 1. Inner class (non-static nested class)
// 2. Static nested class
// 3. Difference between static and non-static inner classes
// 4. How to create objects of inner classes
// 5. Relationship between outer and inner classes

// Outer class
class OuterClass {

    // Instance variable of outer class
    int age;

    // Method of outer class
    public void show() {
        System.out.println("in outer class show");
    }

    // =========================
    // Non-static inner class
    // =========================
    class NonStaticInnerClass {

        // Method inside non-static inner class
        public void show1() {
            System.out.println("in non-static inner class show");
        }
    }

    // =========================
    // Static nested class
    // =========================
    static class StaticNestedClass {

        // Method inside static nested class
        public void show2() {
            System.out.println("in static nested class show");
        }
    }
}

public class InnerClassExample {

    // The main() method is the starting point of the program
    public static void main(String[] args) {

        // Creating object of outer class
        OuterClass obj = new OuterClass();

        // Calling outer class method
        obj.show();

        // =========================
        // Non-static inner class object creation
        // =========================

        // Inner class needs outer class object to exist
        OuterClass.NonStaticInnerClass obj1 = obj.new NonStaticInnerClass();

        // Calling inner class method
        obj1.show1();

        // =========================
        // Static nested class object creation
        // =========================

        // Static nested class does NOT need outer class object
        OuterClass.StaticNestedClass obj2 = new OuterClass.StaticNestedClass();

        // Calling static nested class method
        obj2.show2();
    }
}