// Program Purpose:
// This program demonstrates:
// 1. Method Overriding in Java
// 2. Inheritance (parent-child relationship)
// 3. Runtime polymorphism
// 4. How child class modifies parent behavior

// Parent class
class house {

    // Method in parent class
    public int house_number(int n1) {
        return n1;
    }
}

// Child class extends parent class
class village extends house {

    // Method overriding: same method name and parameters
    // but different implementation in child class
    public int house_number(int n1) {

        // Modifying behavior of parent method
        return n1 + 3;
    }
}

public class MethodOverriding {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating object of child class
        village obj = new village();

        // Calling overridden method
        int r1 = obj.house_number(123);

        // Printing result
        System.out.println(r1);
    }
}