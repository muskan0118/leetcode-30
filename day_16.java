public class day_16 {
    //73. Set Matrix Zeroes
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] zeroRow = new boolean[row];
        boolean[] zeroCol = new boolean[col];

        //check for rows and columns of cells which have zero
        for(int i = 0 ; i< row; i++){
            for(int j = 0 ; j< col; j++){
                if(matrix[i][j]==0){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        //replace with zeros
        for(int i = 0 ; i< row; i++){
            for(int j = 0 ; j< col; j++){
                if(zeroRow[i] || zeroCol[j] ){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
