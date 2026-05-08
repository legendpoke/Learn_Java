public class WhileLoopFactorial {
    public static void main(String[]args){
        // Calculate factorial of 5 using a while loop.
        int i = 1;
        int fact = 1;
        while(i <= 5){
            fact = i*fact;
            i = i + 1;
        }
        System.out.println(fact);
    }
}
