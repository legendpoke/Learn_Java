// Program Purpose:
// This program demonstrates how to create objects,
// store them in an array, and access their data using a loop.

// A class is a blueprint used to create objects.
// This class represents a student.
class students {

    // Instance variables (attributes) of a student.
    int roll_no;
    String name;
    int marks;
}

public class array_obj {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Creates the first student object.
        students s1 = new students();

        // Assigns values to the fields of s1.
        s1.name = "dhruv";
        s1.marks = 99;
        s1.roll_no = 1;

        // Creates the second student object.
        students s2 = new students();

        // Assigns values to the fields of s2.
        s2.name = "liladhar";
        s2.marks = 100;
        s2.roll_no = 2;

        // Creates the third student object.
        students s3 = new students();

        // Assigns values to the fields of s3.
        s3.name = "abhinav";
        s3.marks = 100;
        s3.roll_no = 3;

        // Creates an array that can store references
        // to three students objects.
        students s[] = new students[3];

        // Stores the student objects in the array.
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        // Traverses the array and accesses each object's data.
        for (int i = 0; i < 3; i++) {

            // Accesses the name and marks fields
            // of the current student object and prints them.
            System.out.println(s[i].name + " : " + s[i].marks);
        }
    }
}