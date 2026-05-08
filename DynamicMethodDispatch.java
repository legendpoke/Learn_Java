class ParentDisplay{
    public void show(){
        System.out.println(" A show");
    }
}
class FirstChildDisplay extends ParentDisplay{
    public void show(){
        System.out.println("in b show");
    }
}
class SecondChildDisplay extends ParentDisplay{
    public void show(){
        System.out.println("in c show");
    }

}


public class DynamicMethodDispatch {
    public static void main(String[]args){
        // Dynamic method dispatch.
        ParentDisplay obj = new ParentDisplay();  // obj is currently referencing a ParentDisplay object.
        obj.show();// Output: a show.


        // This works only when there is inheritance between parent and child classes.
        obj = new FirstChildDisplay(); // Output: b show.
        obj.show();

        obj = new SecondChildDisplay();
        obj.show();// Output: c show.
    }
}
