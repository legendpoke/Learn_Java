// An interface defines a contract.
// Its methods are abstract by default, and implementing classes provide the method bodies.



// class to class -> extends
// class to interface -> implements
// interface to interface -> extends
interface DeviceSettings{

    // Variables in an interface are public, static, and final by default.

    int age = 18;
    String name = "dhruv";

    // Interface methods are abstract by default.
    void show();
    void config();
}

interface RunnableTask{
    void run();
}

interface ExtendedRunnableTask extends RunnableTask{
    
}

class DeviceImplementation implements DeviceSettings, ExtendedRunnableTask{// A class can implement multiple interfaces.
    public void show(){
        System.out.println("in b show");
    }
    public void config(){
        System.out.println("in b config");
    }
    public void run(){
        System.out.println("running...");
    }
}

public class InterfaceMethods {
    public static void main(String[]args){
        // Use the interface type for the reference and the implementation class for the object.
        DeviceSettings obj = new DeviceImplementation();
        RunnableTask obj1 = new DeviceImplementation();
        obj.show();
        obj.config();
        obj1.run();

        //DeviceSettings.name = "Dhruv";// This cannot be changed because it is final.
        System.out.println(DeviceSettings.name);
        System.out.println(DeviceSettings.age);
    }
}
