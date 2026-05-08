class DhruvException extends Exception{// A custom exception should extend Exception.
    public DhruvException(String string){
        super(string);// Call the superclass constructor.
    }
}

public class custom_exception {
    public static void main(String[]args){
        int i = 0; // Used to demonstrate the custom exception.
        //int i = 2;
        int j = 0;
        try{
            j = 10/i;
            if ( j == 0);{
                throw new DhruvException("the error is found");// Throw the custom exception.
            }
        }
        catch(DhruvException e){
            // Handle the error here.
            j = 18/1;
            System.out.println("this is the default output" + " : " + e);
        }
        System.out.println(j);
    }
}
