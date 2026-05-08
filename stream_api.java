import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_api {
    public static void main(String[]args){
        // A Stream processes data from a collection.
        // A stream can be consumed only once.
        // Each stream operation returns a new stream or a final result.
        List<Integer> nums = Arrays.asList(1,3,4,6,7,8,9);
        Stream<Integer> s1 = nums.stream();
        // After using a stream once, it cannot be reused.
        //s1.forEach(n -> System.out.println(n));
        // Streams provide methods such as filter(), map(), and reduce().
        Stream<Integer> s2 = s1.filter(n -> n%2==0);// value -> test condition
        //s2.forEach(n -> System.out.println(n));

        // Double each value using map().
        Stream<Integer> s3 = s2.map(n -> n*2);// value -> transformed value
        // s3.forEach(n -> System.out.println(n));

        // reduce() combines all values into one result.
        int result =s3.reduce(0, (c,e) -> c+e);
        System.out.println(result);

        // filter() uses the Predicate interface.
        // Predicate has a test() method that returns a boolean value.


        // map() uses the Function interface.
        // Function has an apply() method that transforms a value.

        // In reduce(), c is the current result and e is the current element.
        // 0 is the initial value.
        // c + e is the operation.

        // Use sorted() when sorted stream values are needed.
        // Stream<Integer> sortedvalues = nums.stream()
        //                 .filter(n -> n%2==0)
        //                 .sorted();
        
        // sortedvalues.forEach(n -> System.out.println(n));

        // Use parallelStream() to process values with multiple threads.
        //Stream<Integer> sortedvalues = nums.parallelStream()
        //                 .filter(n -> n%2==0);
    }
}
