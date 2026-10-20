import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day_20 {
    //15. 3Sum
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int x = i+1;
            int y = nums.length-1;
            while(x<y){
                int sum = nums[i]+ nums[x] + nums[y];
                if(sum==0){
                    List<Integer> group = new ArrayList<>();
                    group.add(nums[x]);
                    group.add(nums[y]);
                    group.add(nums[i]);
                    
                    ans.add(group);
                    x++;
                    y--;

                    //skip duplicates from left
                    while(x<y && nums[x]==nums[x-1]){
                        x++;
                    }
                    
                    //skip duplicates from right
                    while(y>x && nums[y]==nums[y+1]){
                        y--;
                    }
                }
                else if(sum<0){
                    x++;
                }
                else{
                    y--;
                }
            }
        }
        return ans;
    }
}
