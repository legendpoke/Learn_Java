// Program Purpose:
// This program demonstrates:
// 1. Overriding toString() method
// 2. Custom equals() method
// 3. Object comparison based on values (not references)
// 4. Difference between default Object class behavior and custom behavior

class LaptopDetails {

    // Instance variables (object state)
    String model;
    int price;

    // =========================
    // toString() method override
    // =========================

    // This method is automatically called when object is printed
    public String toString() {

        // Returning meaningful string instead of memory address (hashcode)
        return model + " : " + price;
    }

    // =========================
    // Custom equals() method
    // =========================

    // Checks whether two objects have same data (value comparison)
    public boolean equals(LaptopDetails that) {

        // Comparing model and price of both objects
        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        } else {
            return false;
        }
    }
}

public class ObjectClassMethods {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating first object
        LaptopDetails obj1 = new LaptopDetails();
        obj1.model = "dell";
        obj1.price = 1000000;

        // Creating second object with same values
        LaptopDetails obj2 = new LaptopDetails();
        obj2.model = "dell";
        obj2.price = 1000000;

        // Comparing objects using custom equals() method
        boolean result = obj1.equals(obj2);

        // Printing comparison result
        System.out.println(result);

        // Printing object using toString() method
        System.out.println(obj1.toString());
    }
}