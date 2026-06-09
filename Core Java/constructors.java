// Program Purpose:
// This program demonstrates:
// 1. Constructors
// 2. Default Constructor
// 3. Parameterized Constructor
// 4. Encapsulation
// 5. Getters and Setters
// 6. The 'this' keyword

class car {

    // Private instance variables.
    // These variables can only be accessed directly inside this class.
    private String name;
    private int model;

    // A constructor looks like a method, but it has no return type.
    // Its name must be exactly the same as the class name.
    // This is the default constructor.
    public car() {

        // Prints a message whenever the constructor is executed.
        System.out.println("the constructor");

        // Initializes the object with default values.
        model = 2021;
        name = "gt60";
    }

    // Parameterized constructor.
    // Allows values to be provided during object creation.
    public car(int m, String n) {

        // Stores the received values into instance variables.
        model = m;
        name = n;
    }

    // Getter method for name.
    // Returns the current value of name.
    public String getname() {
        return name;
    }

    // Getter method for model.
    // Returns the current value of model.
    public int getmodel() {
        return model;
    }

    // Setter method for name.
    // Updates the instance variable name.
    public void setname(String name) {

        // 'this.name' refers to the instance variable.
        // 'name' refers to the method parameter.
        this.name = name;
    }

    // Setter method for model.
    // Updates the instance variable model.
    public void setmodel(int model) {

        // 'this.model' refers to the instance variable.
        // 'model' refers to the method parameter.
        this.model = model;
    }
}

public class constructors {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates an object using the default constructor.
        car obj = new car();

        // car obj1 = new car(2025, "thar");

        // Every time an object is created,
        // the corresponding constructor executes first.

        // Prints the initialized values of the object.
        System.out.println(obj.getname() + " " + obj.getmodel());

        // System.out.println(obj1.getname() + " " + obj1.getmodel());

        // obj.setname("lamborghini huracan STO");
        // obj.setmodel(2020);

        // System.out.println(obj.getname() + " " + obj.getmodel());
    }
}