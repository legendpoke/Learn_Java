// Program Purpose:
// This program demonstrates:
// 1. Functional Interface
// 2. Anonymous class vs Lambda expression
// 3. Lambda syntax in Java
// 4. Passing parameters in lambda
// 5. Simplified functional programming style

// Functional Interface (Single Abstract Method Interface)
@FunctionalInterface
interface NumberPrinter {

    // Single abstract method
    void show(int i);
}

public class LambdaExpression {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // =========================
        // 1. Anonymous class approach
        // =========================

        NumberPrinter obj = new NumberPrinter() {

            // Implementation of abstract method
            public void show(int i) {
                System.out.println("in show");
            }
        };

        // Calling method
        obj.show(4);

        // =========================
        // 2. Lambda expression (simplified version)
        // =========================

        // Lambda replaces anonymous class boilerplate code
        NumberPrinter obj2 = (i) -> {

            // Using parameter inside lambda
            System.out.println("in 2 show " + i);
        };

        // Calling lambda implementation
        obj2.show(100);
    }
}