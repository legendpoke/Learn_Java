 abstract class bus{
    //public void drive(){// abstract means the behavior is declared but not defined here.
    // For example, a bus class can declare drive(), and a child class can define how it drives.
    // Before using an abstract method, declare it in the parent class.
    // A class with an abstract method must also be abstract.
    // An abstract class can contain both abstract and non-abstract methods.
    // A concrete class is a normal child class that implements the abstract methods.
    //}

    public abstract void drive();// Abstract method declaration ends with a semicolon.

    public void playmusic(){
        System.out.println("playing music");
    }
}

class roadways extends bus{
    public void drive(){
        System.out.println("driving..");
    }
}



public class AbstractKeyword {
    public static void main(String[]args){
        //bus obj = new bus();// An abstract class cannot be instantiated.
        bus obj = new roadways(); 
        obj.drive();
        obj.playmusic();
    }
}
