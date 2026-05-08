// throws is used to declare checked exceptions.
class ClassLoaderExample{
    public void show() throws ClassNotFoundException{
        //try{
            //Class.forName("marvel");
        //}
        //catch(ClassNotFoundException e){
            //System.out.println("class not found");
        //}
        Class.forName("marvel");
    }
}

public class ThrowsKeyword {
    public static void main(String[]args){
        ClassLoaderExample obj = new ClassLoaderExample();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
