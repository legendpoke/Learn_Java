
// Class example.

class SimpleCalculator{
    public int add(int num1,int num2){
        int r = num1+num2;
        return r;
    }
}
public class ClassObjectExample {
    public static void main(String[]args)
    {
        // Create a calculator object and call its add() method.
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(4,5);
        System.out.println(result);
    }
}
