class ParentAnnotationExample{
    public void showthedatawhichbelongstothisclass(){
        System.out.println("in c show");
    }
}

//class ChildAnnotationExample extends ParentAnnotationExample{
    //public void showthedatawhichbelongtothisclass(){// This has a typo and will not override the parent method.
        //System.out.println("in d show");
    //}
//}

class ChildAnnotationExample extends ParentAnnotationExample{
    @Override // This annotation tells the compiler that this method must override a parent method.
    public void showthedatawhichbelongstothisclass(){ 
        System.out.println("in d show");
    }
}
// An annotation gives extra information to the compiler or runtime.
// @Override helps catch mistakes when a child method is meant to override a parent method.




public class OverrideAnnotationExample {
    public static void main(String[]args){
        ChildAnnotationExample obj = new ChildAnnotationExample();
        obj.showthedatawhichbelongstothisclass();
    }
}
