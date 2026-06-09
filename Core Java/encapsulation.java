// Program Purpose:
// This program demonstrates:
// 1. Encapsulation
// 2. Data Hiding using private variables
// 3. Getter methods
// 4. Setter methods
// 5. Controlled access to class data

// Encapsulation means keeping data private and controlling access through methods.
class human {

    // Instance variables should usually be private.
    // private means this variable is accessible only inside this class.
    private String name;
    private int age;

    // Getter method for age.
    // Used to safely access the private variable 'age'.
    public int getage() {
        return age;
    }
    //Getter Methods
    // Getter method for name.
    //Getter methods are used to read private data.
    // Used to safely access the private variable 'name'.
    public String getname() {
        return name;
    }
    
    //Setter Methods
    //Setter methods are used to modify private data.
    // Setter method for age.
    // Used to assign or update the value of 'age'.
    public void setage(int a) {
        age = a;
    }

    // Setter method for name.
    // Used to assign or update the value of 'name'.
    public void setname(String n) {
        name = n;
    }
}

public class encapsulation {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creating an object of human class.
        human obj = new human();

        // Setting values using setter methods.
        obj.setage(30);
        obj.setname("Dhruv");

        // Accessing values using getter methods.
        System.out.println(obj.getage() + " " + obj.getname());
    }
}