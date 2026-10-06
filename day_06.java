public class day_06 {
    //2149. Rearrange Array Elements by Sign
    public int[] rearrangeArray(int[] nums) {
        //track of positive indexes
        int positive = 0;
        //track of negative indexes
        int negative = 1;

        //new answer array
        int[] ans = new int[nums.length];

        for(int i =0 ; i<nums.length; i++){
            if(nums[i]>=0){
                ans[positive] = nums[i];
                positive = positive +2;
            }else{
                ans[negative] = nums[i];
                negative = negative +2;
            }
        }
        return ans;
    }

    //485. Max Consecutive Ones
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max = count;
                }  
            }else{
                count = 0;
            }
        }
        return max;
    }

}
