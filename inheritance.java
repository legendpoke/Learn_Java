// Java does not support multiple inheritance with classes.
public class inheritance {
    public static void main(String[]args){
        //NormalCalculator obj = new NormalCalculator();// Access only two methods.
        //AdvancedCalculator obj = new AdvancedCalculator(); // Access four methods.
        // Single-level inheritance: AdvancedCalculator inherits NormalCalculator.
        VeryAdvancedCalculator obj = new VeryAdvancedCalculator();// Multi-level inheritance.
        int result1=obj.add(7, 9);
        System.out.println(result1);

        int result2 = obj.sub(100, 32);
        System.out.println(result2);

        int result3 = obj.multi(189, 32);
        System.out.println(result3);

        int result4 = obj.divide(129, 32);
        System.out.println(result4);

        double result5 = obj.power(129, 32);
        System.out.println(result5);
    }
}
