// Lambda expressions work with functional interfaces.

@FunctionalInterface
interface NumberPrinter{
    void show(int i);
}



public class LambdaExpression {
    public static void main(String[]args){
        NumberPrinter obj = new NumberPrinter(){// Anonymous class.
            public void show(int i ){
                System.out.println("in show");
            }
        };
        obj.show(4);
        //NumberPrinter obj1 = () -> // The arrow syntax creates a lambda expression.
        // With a lambda, we do not need to write:
        //new a(){
        //public void show}
        // The lambda does the same work with shorter syntax.
        //{
            //System.out.println("in 1 show");
        //};
        //obj1.show();

        // Passing a value into a lambda expression.
        NumberPrinter obj2 = (i) -> {// The type is already defined in the interface method.
            System.out.println("in 2 show" + i);
        };
        obj2.show(100);
    }
}
