public class three_d_array {
    public static void main(String[]args){
        int num[][][] = new int[3][4][5];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 5; k++){
                    num[i][j][k] = (int)(Math.random() * 100);
                    System.out.print(num[i][j][k]  + " ");
                }System.out.println();
            }//System.out.println();
        }//System.out.println();
        System.out.println(num[0][0][0]);
        System.out.println(num[1][0][0]);
        System.out.println(num[0][1][0]);
        System.out.println(num[0][0][1]);
        System.out.println(num[1][1][0]);
        System.out.println(num[1][0][1]);
    }
}
