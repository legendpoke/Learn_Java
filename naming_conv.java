// Camel casing is commonly used in Java.
// Class and interface names start with a capital letter, for example Calc.
// Variable and method names start with a lowercase letter, for example show().
// Constants are written in uppercase, for example PIE or BRAND.
class A {

    public A(){
        System.out.println("object created");

    }
    public void show(){
        System.out.println("show");
    }
}






public class naming_conv {
    public static void main(String[]args){
        //A obj = new A();
        //obj.show();

        new A(); // Anonymous object: an object created without storing its reference.
        new A().show();

    }
}
