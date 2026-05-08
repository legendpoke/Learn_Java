public class multi_array {// 2D array.
    public static void main(String[]args){
        int num[][] = new int[3][4];// Rows * columns.
        for (int i = 0 ; i < 3 ; i++){// Rows.
            for (int j = 0 ; j < 4 ; j++){// Columns.
                // Values are arranged like a matrix.
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
