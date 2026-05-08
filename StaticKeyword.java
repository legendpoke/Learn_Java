class mobile{
    // Instance variables belong to each object.
    String brand;
    int price;
    static String name;// Static variables are shared by all objects of the class.
    // Static members belong to the class, so they can be accessed with the class name.

    //static{// static block
    //name = "phone";// A static block runs only once when the class is loaded.
    // //The static block runs before the constructor.
    // //If the class is never loaded, the static block and constructor will not run.
    //System.out.println("the static block");
//}



   // public mobile(){// constructor
        //brand = "";
        //price = 200;
       // name = "phine";
        //System.out.println("the constructor block");
    //}


    public void show(){// Instance method, also called a non-static method.
        // A non-static method must be called through an object.
        System.out.println(brand + " : " + price + " : " + name );
    }
    // A static method cannot directly use non-static variables such as brand and price.
    //public static void show1(){
        //System.out.println(brand + " : " + price + " : " + name );
    //}


    // Static methods can directly use static variables.
    public static void show1(){
        System.out.println("static method");
    }

    // To use non-static variables in a static method, pass an object as a parameter.
    public static void show2(mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}


public class StaticKeyword {
    public static void main(String[]args) //throws ClassNotFoundException
    {

        // Use Class.forName() when you want to load a class manually.
        // This runs the static block.
        //Class.forName("mobile");

        mobile obj1 = new mobile();
        obj1.brand = "samsung";
        obj1.price = 1000000;
        mobile.name = "phone"; // Static variables can be accessed directly with the class name.
        // Changing a static variable affects all objects of that class.

        mobile obj2 = new mobile();
        obj2.brand = "apple";
        obj2.price = 10000;

        // Print the object values.
       obj1.show();
       obj2.show();

        mobile.show1();// Static methods can be called directly with the class name.
        mobile.show2(obj1);




    

    }
}
