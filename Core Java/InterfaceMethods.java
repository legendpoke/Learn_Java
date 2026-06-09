// Program Purpose:
// This program demonstrates:
// 1. Interface concept in Java
// 2. Multiple interface implementation
// 3. Interface inheritance
// 4. Constants in interfaces (public static final)
// 5. Polymorphism using interfaces

// =========================
// Interface 1
// =========================

// An interface defines a contract.
// All methods are abstract by default.
interface DeviceSettings {

    // Variables in an interface are:
    // public static final by default (constants)

    int age = 18;
    String name = "dhruv";

    // Abstract methods (no body)
    void show();
    void config();
}

// =========================
// Interface 2
// =========================
interface RunnableTask {

    // Abstract method
    void run();
}

// =========================
// Interface inheritance
// =========================
interface ExtendedRunnableTask extends RunnableTask {
    // No new methods added here
    // It inherits run() from RunnableTask
}

// =========================
// Implementation class
// =========================

// A class can implement multiple interfaces
class DeviceImplementation implements DeviceSettings, ExtendedRunnableTask {

    // Implementation of DeviceSettings methods
    public void show() {
        System.out.println("in b show");
    }

    public void config() {
        System.out.println("in b config");
    }

    // Implementation of RunnableTask method
    public void run() {
        System.out.println("running...");
    }
}

public class InterfaceMethods {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Interface reference using implementation object
        DeviceSettings obj = new DeviceImplementation();

        // Another interface reference
        RunnableTask obj1 = new DeviceImplementation();

        // Calling methods using interface reference
        obj.show();
        obj.config();
        obj1.run();

        // Accessing interface constants
        System.out.println(DeviceSettings.name);
        System.out.println(DeviceSettings.age);

        // This is NOT allowed because interface variables are final:
        // DeviceSettings.name = "Dhruv"; ❌
    }
}