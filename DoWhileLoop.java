public class DoWhileLoop {
    public static void main(String[]args){
        int i = 1;
        // A do-while loop runs the body once before checking the condition.
        do{
            System.out.println("hi"+i);
            i = i+ 1;
        }while( i <= 4);
        // while(i < 1); would run only once because of the condition.
    }
}
