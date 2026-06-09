// Program Purpose:
// This program demonstrates:
// 1. Upcasting (Child → Parent reference)
// 2. Downcasting (Parent → Child reference)
// 3. Type casting in inheritance
// 4. Access control of methods in parent-child hierarchy

class ParentCastingExample {

    // Method belonging to parent class
    public void show1() {
        System.out.println("in parent show");
    }
}

class ChildCastingExample extends ParentCastingExample {

    // Method belonging to child class
    public void show2() {
        System.out.println("in child show");
    }
}

public class TypeCasting {

    public static void main(String[] args) {

        // =========================
        // 1. UPCASTING
        // =========================

        // Child object is referenced by Parent type
        ParentCastingExample obj = new ChildCastingExample();

        // WHAT:
        // Child object treated as Parent type

        // HOW:
        // Done automatically by Java (implicit casting)

        // USED FOR:
        // ✔ Polymorphism
        // ✔ Generalization (treat different children as same parent type)
        // ✔ Loose coupling

        obj.show1(); // Only parent methods accessible through this reference

        // obj.show2(); ❌ Not allowed (parent reference does not know child methods)

        // =========================
        // 2. DOWNCASTING
        // =========================

        // Converting Parent reference back to Child reference
        ChildCastingExample obj1 = (ChildCastingExample) obj;

        // WHAT:
        // Parent reference is explicitly converted to Child type

        // HOW:
        // Done manually using (ChildCastingExample) cast

        // USED FOR:
        // ✔ Access child-specific methods
        // ✔ Restore full object behavior

        obj1.show2(); // Now child method is accessible
    }
}