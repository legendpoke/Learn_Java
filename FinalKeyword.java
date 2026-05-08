// The final keyword can be used with a class, method, or variable.

// A final class cannot be inherited.
final class f{
    public  final void show(){
        System.out.println("show in f");
    }
}

// A final method cannot be overridden.
//class k extends f{// this shows error
    //public void show(){
        //System.out.println("show in k ");
    //}
//}




public class FinalKeyword {
    public static void main(String[]args){
        final int num = 8;// A final variable cannot be assigned again.
        // final makes the variable constant.
        //num = 9;
        System.out.println(num);
        f obj = new f();
        obj.show();
    }
}
