
@FunctionalInterface
interface Addition{
    int add(int i,int j);
}
//class AdditionImplementation implements Addition{
    //public int add(int i, int j){
        //return i + j;
    //}
//}

public class MoreLambdaMethods {
    public static void main(String[]args){
        // Lambda expression that implements the add() method.
        Addition obj = (i,j) -> {
            return i+j;
        };
        int result = obj.add(123,1234);
        System.out.println(result);
    }
}
