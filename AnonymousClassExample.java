// Anonymous means it does not have a name.
class GreetingPrinter{
    public void show(){
        System.out.println("in greeting printer show");
    }
}


public class AnonymousClassExample {
    public static void main(String[]args){
        GreetingPrinter obj = new GreetingPrinter(){
            public void show(){// This method belongs to the anonymous class.
                // Inner class implementation.
                System.out.println("in new show");
            }
        };
        obj.show();// This calls the new method implementation,
        // not the original method from the class.
    }
}
