public class day_18 {
    //48. Rotate Image
    public void rotate(int[][] matrix) {
        int m = matrix.length-1;
        for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }

        for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j< matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][m-j];
                matrix[i][m-j]= temp;
            }
        }
    }
}
