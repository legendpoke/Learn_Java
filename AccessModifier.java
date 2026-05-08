public class AccessModifier {
    // public: accessible from any class, including classes in other packages.
   
   
    // private: accessible only inside the same class.
    // Example: instance variables are usually kept private.
    
    
    // default: accessible only inside the same package.
    // Prefer public, private, or protected when you want to make access clear.
    
    
    // protected: accessible inside the same package and by subclasses in other packages.
}



//                          private        protected     public      default
// same class                yes            yes           yes         yes

// same-package subclass     no             yes           yes         yes

// same-package non-subclass no             yes           yes         yes

// different-package         no             yes           yes         no
// subclass

// different-package         no             no            yes         no
// non-subclass
