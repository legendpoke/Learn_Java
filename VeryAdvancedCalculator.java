public class VeryAdvancedCalculator extends AdvancedCalculator{
    // Java does not support multiple inheritance with classes.
    // class VeryAdvancedCalculator extends AdvancedCalculator,NormalCalculator
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}
