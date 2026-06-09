// Program Purpose:
// This program demonstrates:
// 1. ArrayList/List usage
// 2. Iteration using traditional for loop
// 3. forEach() method
// 4. Functional interface (Consumer)
// 5. Lambda-style iteration concept (commented)

// Importing utility classes for List and Arrays
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class for_each {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creating an immutable List using Arrays.asList()
        List<Integer> nums = Arrays.asList(1, 3, 4, 6, 7, 8, 9);

        // =========================
        // 1. Traditional for loop
        // =========================

        // Iterates using index-based access
        for (int i = 0; i < nums.size(); i++) {

            // Gets element at index i
            System.out.println(nums.get(i));
        }

        // =========================
        // 2. forEach with lambda (commented)
        // =========================

        // nums.forEach(n -> System.out.println(n));

        // =========================
        // 3. Using Consumer interface
        // =========================

        // Consumer is a functional interface in Java
        // It represents an operation that accepts a single input and returns nothing

        Consumer<Integer> con = new Consumer<Integer>() {

            // accept() method defines what to do with each element
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        // Passing Consumer to forEach()
        nums.forEach(con);
    }
}