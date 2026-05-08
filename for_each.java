import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class for_each {
    public static void main(String[]args){
        List<Integer> nums = Arrays.asList(1,3,4,6,7,8,9);

        // Use a simple for loop to print all values.
        for(int i = 0;i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

        // Use forEach().
        //nums.forEach(n -> System.out.println(n));

        // Use the Consumer interface.
        // Consumer is a functional interface, so it can be implemented with a lambda.
        // accept() is the method in Consumer.
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);
    }
}
