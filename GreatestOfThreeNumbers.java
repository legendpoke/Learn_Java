public class GreatestOfThreeNumbers {
    public static void main(String[]args){
        // Find the greatest number among three numbers.
        int a = 12;
        int b = 13;
        int c = 16;
        if(a > b && a >c){
            System.out.println("a is greater number");
        }
        else if(b > a && b > c){
            System.out.println("b is greater number");
        }
        else{
            System.out.println("c is greater number");
        }
    }
}
