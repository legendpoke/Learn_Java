public class array {
    public static void main(String[]args){
        int num[] = {3,4,5,6};
        // Print array values using indexes, which start from 0 and go to n - 1.
        // n is the number of values in the array.
        System.out.println(num[0]);
        //System.out.println(num[1]); output 4
        //System.out.println(num[2]); output 5
        //System.out.println(num[3]);output 6
       

        // Update a value.
        // Change the value at index 1 to 8.
        num[1] = 8;
        System.out.println(num[1]);
    }
}
