abstract class AbstractDisplay{
    public abstract void show();
}

class NormalDisplay extends AbstractDisplay{
    public void show(){
        System.out.println("in normal display show");
    }
}


public class AbstractAnonymousClass {
    public static void main(String[]args){
        AbstractDisplay obj = new NormalDisplay();
        obj.show();

        // Creating an anonymous class object.
        // Anonymous classes are useful when the implementation is needed only once.
        // Multiple anonymous class objects can also be created.
        AbstractDisplay obj1 = new AbstractDisplay(){
            public void show(){
                System.out.println("in new show ");
            }
        };
        obj1.show();
    }
}
