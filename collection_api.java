// Collection: an interface used to store groups of objects.
// Collections: a utility class with helper methods for collections.
// Collection API: Java's built-in set of classes and interfaces for storing data.
// The API provides ready-made data structures and algorithms.
// List keeps insertion order and allows duplicate values.

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Collection;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collection_api {
    public static void main(String[]args){
        // Angle brackets <> specify the data type stored in the collection.
        //Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();
        // List allows repeated values.
        Set<Integer> nums = new HashSet<Integer>();
        // Set stores only unique values.
        // TreeSet stores unique values in sorted order.
        Set<Integer> num = new TreeSet<Integer>();
        nums.add(9);
        nums.add(8);// add() receives an element.
        nums.add(10);
        nums.add(50);
        nums.add(100);
        //nums.add(100);
        num.add(12);
        num.add(200);
        num.add(500);
        num.add(1200);
        num.add(9);
        num.add(1);
        num.add(99);

        // System.out.println(nums.indexOf(100));
        // System.out.println(nums.get(3));
        // Enhanced for loop to print all elements.
        // for(int n : nums){
        //     System.out.println(n);
        // }

        // // Multiplying each element by two.
        // for(int n : nums){
        //     int num = n;
        //     System.out.println(num*2);
        // }
        for(int n : nums){
            // int num = n;
            System.out.println(n);
        }
        for(int n : num){
            // int num = n;
            System.out.println(n);
        }
    }
}
