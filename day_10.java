import java.util.ArrayList;
import java.util.List;

public class day_10 {
    //54. Spiral Matrix
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        int col_max = col;
        int col_min = 0;
        int row_max = row;
        int row_min = 0;

        while(col_min <= col_max && row_min <= row_max){
            for(int i = col_min; i<=col_max; i++){
                ans.add(matrix[row_min][i]);
            }
            row_min++;

            for(int i = row_min; i<=row_max; i++){
                ans.add(matrix[i][col_max]);
            }
            col_max--;

            //if row_min>row_max --> it means we had already traversed that row
            if(row_min<=row_max){
            for(int i = col_max; i>=col_min; i--){
                ans.add(matrix[row_max][i]);
            }
            row_max--;
            }

            //if col_min>col_max --> it means we had already traversed that column
            if(col_min <= col_max){
            for(int i = row_max; i>=row_min; i--){
                ans.add(matrix[i][col_min]);
            }
            col_min++;
            }
        }
        return ans;
    }
}
