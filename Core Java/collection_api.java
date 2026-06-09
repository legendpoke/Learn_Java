// Program Purpose:
// This program demonstrates:
// 1. Collection API
// 2. Set Interface
// 3. HashSet
// 4. TreeSet
// 5. Generics
// 6. Enhanced For Loop (for-each loop)

// Collection: an interface used to store groups of objects.
// Collections: a utility class with helper methods for collections.
// Collection API: Java's built-in set of classes and interfaces for storing data.
// The API provides ready-made data structures and algorithms.
// List keeps insertion order and allows duplicate values.

// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.Collection;
// import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collection_api {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Angle brackets <> specify the type of data
        // that can be stored in the collection.

        // Collection<Integer> nums = new ArrayList<Integer>();

        // List<Integer> nums = new ArrayList<Integer>();

        // List allows duplicate values and maintains insertion order.

        // Creates a HashSet that stores Integer objects.
        Set<Integer> nums = new HashSet<Integer>();

        // Set stores only unique values.

        // Creates a TreeSet that stores Integer objects.
        Set<Integer> num = new TreeSet<Integer>();

        // TreeSet stores unique values in sorted order.

        // Adds values to the HashSet.
        nums.add(9);

        // add() inserts an element into the collection.
        nums.add(8);

        nums.add(10);
        nums.add(50);
        nums.add(100);

        // nums.add(100);
        // Duplicate values are ignored in a Set.

        // Adds values to the TreeSet.
        num.add(12);
        num.add(200);
        num.add(500);
        num.add(1200);
        num.add(9);
        num.add(1);
        num.add(99);

        // System.out.println(nums.indexOf(100));
        // indexOf() exists in List, not Set.

        // System.out.println(nums.get(3));
        // get() exists in List, not Set.

        // Enhanced for loop (for-each loop)
        // used to traverse every element in the HashSet.
        for (int n : nums) {

            // Prints each value stored in nums.
            System.out.println(n);
        }

        // Enhanced for loop used to traverse
        // every element in the TreeSet.
        for (int n : num) {

            // Prints each value stored in num.
            System.out.println(n);
        }
    }
}