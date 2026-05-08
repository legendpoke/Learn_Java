public class ForLoopExample {
    public static void main(String[]args){
        // Outer loop prints numbers from 1 to 10.
        for ( int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
            // Inner loop prints values smaller than the current outer-loop value.
            for ( int j = 1 ; j < i ; j++){
                System.out.println(j);
            }
        }
    }
}
