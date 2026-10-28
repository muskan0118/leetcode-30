import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day_28 {
    //442. Find All Duplicates in an Array
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int a: nums){
            map.put(a, map.getOrDefault(a,0)+1);
        }

        for(Map.Entry<Integer,Integer> element: map.entrySet()){
            if(element.getValue()==2){
                ans.add(element.getKey());
            }
        }
        return ans;
    }
}
