import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_with {
    public static void main(String[]args) throws NumberFormatException, IOException{
        int i = 0;
        int j = 0;
        try{
            j = 18/i;
        }
        catch( Exception e){
            System.out.println("something went wrong");
        }
        finally{// finally always executes, whether an exception occurs or not.
            // Use finally when a resource must be closed.
            System.out.println("bye");
        }
        System.out.println(j);

        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }// In try-with-resources, the resource closes automatically after try finishes.
    }
}
