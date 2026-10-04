public class day_04 {
    //---34. Find First and Last Position of Element in Sorted Array---//

    //finding the first occurence
    public static int findFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int first = -1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid]==target){
                first = mid;
                end = mid -1;
            }else if(nums[mid]>target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return first;
    }
    //finding the last occurence
    public static int findLast(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int last = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            
             if(nums[mid]==target){
                last = mid;
                start = mid +1;
                
            }else if(nums[mid]<target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return last;
    }

    //calculating the range
    public int[] searchRange(int[] nums, int target) {
        
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
    
        int[] ans = {first,last};
        return ans;
    }

//-----------------------------------------------------------------//
    //---283. Move Zeroes---//
    public void moveZeroes(int[] nums) {
        int i = 0 ;
        for(int j = 0; j< nums.length; j++){
            if(nums[j] !=0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
//------------------------------------------------------------------//
    //268. Missing Number
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i<=n; i++){
            ans = ans ^ i;
        }

        for(int element: nums){
            ans = ans ^ element;
        }
        return ans;
    }
//------------------------------------------------------------------//
    //26. Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
        //i assigns the position
        int i = 0;

        //j finds the next unique element
        for(int j = 0; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return i+1;
    }
}
