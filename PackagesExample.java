// Use the import keyword to access classes from another package.
// Syntax: import package_name.class_name;
//import tools.PackageOne;
//import tools.PackageTwo;

// Example of a built-in Java package.
//import java.util.ArrayList;
// java.util contains utility classes such as ArrayList.


// Use * to import all classes from a package.
import tools.*;



public class PackagesExample {
    public static void main(String[]args){
        // Create objects from classes inside the tools package.
        PackageOne obj = new PackageOne();
        PackageTwo obj1 = new PackageTwo();
        //ArrayList list = new ArrayList<>();
        System.out.println( " " + obj + obj1);
    }
}
