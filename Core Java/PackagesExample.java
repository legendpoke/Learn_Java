// Program Purpose:
// This program demonstrates:
// 1. Java packages
// 2. Importing classes from another package
// 3. Using wildcard (*) import
// 4. Accessing user-defined package classes

// =========================
// Package Import Section
// =========================

// Using wildcard (*) to import all classes from "tools" package
import tools.*;

public class PackagesExample {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating object of class PackageOne from tools package
        PackageOne obj = new PackageOne();

        // Creating object of class PackageTwo from tools package
        PackageTwo obj1 = new PackageTwo();

        // Printing objects (will use default toString() unless overridden)
        System.out.println(" " + obj + obj1);
    }
}