// Program Purpose:
// This program demonstrates:
// 1. Inheritance in Java (multi-level inheritance)
// 2. Method reuse from parent classes
// 3. How Java supports single inheritance (not multiple inheritance with classes)
// 4. Object accessing methods from entire inheritance chain

public class inheritance {

    // The main() method is the starting point of the program
    public static void main(String[] args) {

        // Java does NOT support multiple inheritance with classes
        // (a class cannot extend more than one class)

        // VeryAdvancedCalculator inherits from AdvancedCalculator,
        // which in turn inherits from NormalCalculator

        VeryAdvancedCalculator obj = new VeryAdvancedCalculator();

        // Method inherited from NormalCalculator (basic operation)
        int result1 = obj.add(7, 9);
        System.out.println(result1);

        // Method inherited from NormalCalculator
        int result2 = obj.sub(100, 32);
        System.out.println(result2);

        // Method inherited from AdvancedCalculator
        int result3 = obj.multi(189, 32);
        System.out.println(result3);

        // Method inherited from AdvancedCalculator or overridden in child
        int result4 = obj.divide(129, 32);
        System.out.println(result4);

        // Method defined in VeryAdvancedCalculator
        double result5 = obj.power(129, 32);
        System.out.println(result5);
    }
}