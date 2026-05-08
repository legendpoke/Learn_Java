class OuterClass{// A top-level class cannot be static.
    int age;// Instance variable.

    public void show(){ // Method.
        System.out.println("in outer class show");
    }

    class NonStaticInnerClass{// Non-static inner class.
        public void show1(){
            System.out.println("in non-static inner class show");
        }
    }

    static class StaticNestedClass{// Static nested class.
         public void show2(){
            System.out.println("in static nested class show");
        }
    }
}


public class InnerClassExample {
    public static void main(String[]args){
        OuterClass obj = new OuterClass();
        obj.show();

        //NonStaticInnerClass obj1 = new NonStaticInnerClass();// This gives an error because the class is inside OuterClass.
        OuterClass.NonStaticInnerClass obj1 = obj.new NonStaticInnerClass();// A non-static inner class needs an object of the outer class.
        obj1.show1();

        OuterClass.StaticNestedClass obj2 = new OuterClass.StaticNestedClass();// A static nested class can be created with the outer class name.
        obj2.show2();


    }
}
