// Program Purpose:
// This program demonstrates:
// 1. Map (HashMap) in Java
// 2. Key-value pair storage
// 3. Duplicate key behavior
// 4. Retrieving values using keys
// 5. Iterating through a Map

// Importing HashMap and Map interface
import java.util.HashMap;
import java.util.Map;

public class map {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating a Map where:
        //map is a key value storage system 
        // Key = String (student name)
        // Value = Integer (marks)
        Map<String, Integer> students = new HashMap<>();

        // =========================
        // 1. Adding key-value pairs
        // =========================

        students.put("dhruv", 100);
        students.put("kauti", 99);
        students.put("ayan", 98);
        students.put("liladhar", 99);

        // Duplicate key ("kauti") → value will be overwritten
        students.put("kauti", 97);

        // Printing entire map
        System.out.println(students);

        // =========================
        // 2. Access value using key
        // =========================

        System.out.println(students.get("kauti"));

        // =========================
        // 3. Get all keys
        // =========================

        System.out.println(students.keySet());

        // =========================
        // 4. Iterate through Map
        // =========================

        for (String key : students.keySet()) {

            // Fetching value using key
            System.out.println(key + " : " + students.get(key));
        }
    }
}