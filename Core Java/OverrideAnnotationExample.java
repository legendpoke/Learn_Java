// Program Purpose:
// This program demonstrates:
// 1. Method overriding in inheritance
// 2. Use of @Override annotation
// 3. How annotations help prevent mistakes
// 4. Runtime polymorphism behavior

// Parent class
class ParentAnnotationExample {

    // Method in parent class
    public void showthedatawhichbelongstothisclass() {
        System.out.println("in c show");
    }
}

// Child class extending parent class
class ChildAnnotationExample extends ParentAnnotationExample {

    // @Override tells compiler this method must override a parent method
    @Override
    public void showthedatawhichbelongstothisclass() {
        System.out.println("in d show");
    }
}

public class OverrideAnnotationExample {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating object of child class
        ChildAnnotationExample obj = new ChildAnnotationExample();

        // Calling overridden method
        obj.showthedatawhichbelongstothisclass();
    }
}