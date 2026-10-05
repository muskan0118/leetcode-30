import java.util.HashMap;
import java.util.Map;

public class day_05 {

    //169. Majority Element
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = nums.length/2;

        //maps the element with its frequency
        for(int a: nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        //checks for the frequency greater than max
        for(Map.Entry<Integer,Integer> element: map.entrySet()){
            if(element.getValue()>max){
                return element.getKey();
            }
        }
        return -1;
    }

    //1. Two Sum
    public int[] twoSum(int[] nums, int target) {
        //created a hashmap to store value and its index
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            //the number we are finding is termed as needed
            int needed = target - nums[i];

            //we need check in the map that the number we are finding is it already presnet int the map or not. If it is not present we will add the value and the index
            if(map.containsKey(needed)){
                return new int[]{i,map.get(needed)};
            }

            //add the value and its index becaise we haven't seen it earlier
            map.put(nums[i],i);
        }

        return new int[]{};
    }


}
