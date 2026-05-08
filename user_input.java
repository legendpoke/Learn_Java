//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class user_input {
    public static void main(String[]args) throws NumberFormatException, IOException{
        System.out.println("enter a number:");
        //InputStreamReader in = new InputStreamReader(System.in);
        //BufferedReader bf = new BufferedReader(in);

        // Easier way to get input from the user.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}
