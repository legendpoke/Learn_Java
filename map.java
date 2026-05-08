// Map stores data as key-value pairs.

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[]args){
        Map<String, Integer> students = new HashMap<>();
        // Keys cannot be repeated, but values can be repeated.
        // String is the key type.
        // Integer is the value type.
        // Key and value types are written inside angle brackets.
        students.put("dhruv", 100);
        students.put("kauti", 99);
        students.put("ayan", 98);
        students.put("liladhar", 99);
        students.put("kauti", 97);
        System.out.println(students);
        System.out.println(students.get("kauti"));
        // Get all keys.
        System.out.println(students.keySet());

        // Use a loop to get each key and value.
        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}
