import java.util.Stack;

public class day_08 {
    //20. Valid Parentheses
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        int n = s.length();
        if(n%2 !=0){
            return false;
        }

        for(int i = 0; i<n;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                ans.push(s.charAt(i));
            }
            else if(ans.size()>0 && s.charAt(i) == ')' && ans.peek() == '('){
                ans.pop();
            }else if(ans.size()>0 && s.charAt(i) == ']' && ans.peek() == '['){
                ans.pop();
            }else if(ans.size()>0 && s.charAt(i) == '}' && ans.peek() == '{'){
                ans.pop();
            }else{
                return false;
            }
        }
        return ans.isEmpty();
    }

    //53. Maximum Subarray
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1; i< nums.length; i++){
           sum = Math.max(nums[i]+sum,nums[i]);
           max = Math.max(sum,max);
        }
        return max;
    }

}

