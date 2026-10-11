import java.util.ArrayList;
import java.util.List;

public class day_11 {
    //118. Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<Integer> prev = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        int start = 0;
        prev.add(1);
        ans.add(prev);
        while(start<numRows-1){
        List<Integer> pairs = new ArrayList<>();
            pairs.add(1);
            for(int i =0; i<start; i++){
                int current = prev.get(i)+prev.get(i+1);
                pairs.add(current);
            }
            pairs.add(1);
            ans.add(pairs);
            prev = pairs;
            start++;
        }
        return ans;
    }
}
