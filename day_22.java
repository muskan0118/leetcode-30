public class day_22 {
    //153. Find Minimum in Rotated Sorted Array
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int start = 0;
        int end = n-1;

        if(n==1){
            return nums[0];
        }

        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid]>nums[end]){
                start = mid + 1;
            }else{
                //if we do not use the min value then the answer can get updated
                min = Integer.min(nums[mid],min);
                end = mid-1;
            }
        }
        return min;
    }

    //747. Largest Number At Least Twice of Others
    public int dominantIndex(int[] nums) {
        int max = 0;
        int ans= 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                ans = i;
            }
        }

        for(int i =0; i<nums.length;i++){
            if(i==ans){
                continue;
            }
            if(max<2*nums[i]){
                return -1;
            }
        }
        return ans;
    }
}
