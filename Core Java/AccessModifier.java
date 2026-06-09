// Program Purpose:
// This file explains the four main access modifiers in Java:
// 1. public
// 2. private
// 3. protected
// 4. default (package-private)

public class AccessModifier {

    // public:
    // Members declared as public can be accessed from anywhere.
    // They are accessible from:
    // - The same class
    // - Other classes in the same package
    // - Classes in different packages

    // private:
    // Members declared as private can only be accessed
    // inside the class where they are declared.
    //
    // Commonly used for:
    // - Instance variables (Data Hiding)
    // - Encapsulation

    // default:
    // When no access modifier is written,
    // Java automatically uses default access.
    //
    // Accessible only within the same package.
    //
    // Not accessible from classes in different packages.

    // protected:
    // Members declared as protected are accessible:
    // - Within the same package
    // - By subclasses in other packages
    //
    // Often used when inheritance is involved.
}