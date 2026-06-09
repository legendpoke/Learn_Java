// Program Purpose:
// This program demonstrates:
// 1. Enum class in Java
// 2. Enum constructors
// 3. Enum with parameters
// 4. Instance variables inside enum
// 5. Looping through enum values

// Enum (enumeration) is a special class used to define a fixed set of constants.
enum laptop {

    // Enum constants.
    // Some constants pass price values to constructor,
    // others use default constructor.

    macbook(2000),
    dell,
    asus(1500),
    thinkpad(1700);

    // Instance variable inside enum.
    private int price;

    // Default constructor (used when no value is passed).
    // Automatically assigns a default price.
    private laptop() {
        price = 2900;
    }

    // Parameterized constructor (used when price is given).
    private laptop(int price) {
        this.price = price;
    }

    // Getter method to access price safely.
    public int getprice() {
        return price;
    }

    // Setter method to modify price.
    public void setprice(int price) {
        this.price = price;
    }
}

public class enum_class {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Selecting a specific enum constant.
        laptop lap = laptop.asus;

        // Prints the selected enum constant and its price.
        System.out.println(lap + " : " + lap.getprice());

        // Getting all enum values as an array.
        laptop[] lap1 = laptop.values();

        // Looping through all enum constants.
        for (int i = 0; i < lap1.length; i++) {

            // Printing each enum constant and its price.
            System.out.println(lap1[i] + " : " + lap1[i].getprice());
        }
    }
}