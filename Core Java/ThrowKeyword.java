public class ThrowKeyword {
    public static void main(String[]args){
        int i = 0; // Used to demonstrate the exception.
        //int i = 2;
        int j = 0;
        try{
            j = 13/i;
            if ( j ==0);{
                throw new ArithmeticException();// This sends control to the catch block.
                // The throw keyword is used to manually throw an exception.
            }
        }
        catch(ArithmeticException e){
            // Handle the error here.
            j = 18/1;
            System.out.println("this is the default output" + " : " + e);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(j);
    }
}
