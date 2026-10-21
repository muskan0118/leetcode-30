public class day_21 {
    //152. Maximum Product Subarray
    public int maxProduct(int[] nums) {
        //brute force
        if(nums.length==1){
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        for(int i =0; i<nums.length;i++){
            int product = 1;
            for(int j = i; j<nums.length;j++){
                product = product*nums[j];
                max = Math.max(max,product);
            }
        }
        return max;
    }
}
