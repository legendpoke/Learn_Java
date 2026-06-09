// Program Purpose:
// This program demonstrates:
// 1. Instance variables
// 2. Local variables
// 3. Object-specific memory behavior
// 4. How different objects maintain separate copies of instance variables

// Class containing an instance variable and a method
class InstanceVariableCalculator {

    // Instance variable (belongs to object, not method)
    int num = 8;

    // Method with local variables
    public int add(int n1, int n2) {

        // n1 and n2 are local variables (exist only inside this method)
        return n1 + n2;
    }
}

public class InstanceVariableExample {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating first object of class
        InstanceVariableCalculator obj = new InstanceVariableCalculator();

        // Changing instance variable for obj only
        obj.num = 9;

        // Printing updated value for obj
        System.out.println(obj.num);

        // Creating second object of same class
        InstanceVariableCalculator obj1 = new InstanceVariableCalculator();

        // Printing instance variable of obj1 (not modified)
        System.out.println(obj1.num);
    }
}// Program Purpose:
// This program demonstrates:
// 1. Instance variables
// 2. Local variables
// 3. Object-specific memory behavior
// 4. How different objects maintain separate copies of instance variables

// Class containing an instance variable and a method
class InstanceVariableCalculator {

    // Instance variable (belongs to object, not method)
    int num = 8;

    // Method with local variables
    public int add(int n1, int n2) {

        // n1 and n2 are local variables (exist only inside this method)
        return n1 + n2;
    }
}

public class InstanceVariableExample {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating first object of class
        InstanceVariableCalculator obj = new InstanceVariableCalculator();

        // Changing instance variable for obj only
        obj.num = 9;

        // Printing updated value for obj
        System.out.println(obj.num);

        // Creating second object of same class
        InstanceVariableCalculator obj1 = new InstanceVariableCalculator();

        // Printing instance variable of obj1 (not modified)
        System.out.println(obj1.num);
    }
}