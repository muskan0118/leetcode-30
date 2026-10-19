public class day_19 {
    //278. First Bad Version
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(isBadVersion(mid)){
                ans = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    //35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while(start<=end){
            mid = start + (end - start)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
}
