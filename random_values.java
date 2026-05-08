public class random_values {
    public static void main(String[] args) {
        int num[][] = new int[3][4];// Rows * columns.
        for (int i = 0 ; i < 3 ; i++){// Rows.
            for (int j = 0 ; j < 4 ; j++){// Columns.
                num[i][j] = (int)(Math.random()*10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
