public class linear_search {
    public static void main(String[]args){
        int num[] = {1,2,3,4,5,6,7,8};
        int a = 8;
        int i = 0;
        while( i < 9){
            i++;
        }
        if(a == num[i]){
            System.out.println("the number is found at index " + " : " + num[i]);
        }
        else{
            System.out.println("the number is not found ");
        }
    }
}
