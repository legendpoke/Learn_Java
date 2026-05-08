// A functional interface has exactly one abstract method.
// If a second abstract method is added, the compiler shows an error.
@FunctionalInterface 
interface Displayable{
    void show();
}
class DisplayMessage implements Displayable{
    public void show(){
        System.out.println("in display message show");
    }
}


public class FunctionalInterfaceExample {
    public static void main(String[]args){
        // Anonymous class implementation of Displayable.
        Displayable obj = new Displayable(){
            public void show(){
                System.out.println("in show");
            }
        };// We can use an anonymous class.
        // We cannot create an object directly from an interface.
        DisplayMessage obj1 = new DisplayMessage();
        Displayable obj2 = new DisplayMessage();
        obj.show();
        obj1.show();
        obj2.show();
    }
}
