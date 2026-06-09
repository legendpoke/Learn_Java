// Every Java class indirectly extends Object.
// super is used to call a parent class constructor or method.
class ParentConstructor extends Object {// Superclass.
    
    // Every constructor calls super() first, either explicitly or automatically.
    public ParentConstructor(){
        super();// This calls the Object class constructor.
        System.out.println("in a");
    }
    public ParentConstructor(int a){
        super();
        System.out.println("in a int");
    }

}

class ChildConstructor extends ParentConstructor{// Inheritance example.
    public ChildConstructor(){
        super();// Calls the no-argument constructor of ParentConstructor.
        System.out.println("in b");
    }

    public ChildConstructor(int b){
        //super(1);// Calls the parameterized constructor of ParentConstructor.
        // this() calls another constructor in the same class.
        // Output order:
        // in a
        // in b
        // int b
        this();
        System.out.println("int b");
    }
}



public class ThisSuperExample {
    public static void main(String[]args){
        //ChildConstructor obj = new ChildConstructor(6);
        ChildConstructor obj = new ChildConstructor(6);
        System.out.println(obj);
    }
}
// super() calls the parent class constructor.
