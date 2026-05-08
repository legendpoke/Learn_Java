class ParentCastingExample{
    public void show1(){
        System.out.println("in parent show");
    }
}

class ChildCastingExample extends ParentCastingExample{
    public void show2(){
        System.out.println("in child show");
    }
}






public class TypeCasting {
    public static void main(String[]agrs){
        ParentCastingExample obj = new ChildCastingExample();// Upcasting.
        //ParentCastingExample obj = (ParentCastingExample) new ChildCastingExample();// This cast is optional because upcasting happens automatically.
        obj.show1();

        // Downcasting gives access to child-class methods through a parent-class reference.
        // Example: obj does not know about show2() until it is cast back to ChildCastingExample.
        ChildCastingExample obj1 = (ChildCastingExample) obj;
        obj1.show2();

    }
}
