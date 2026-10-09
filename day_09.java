public class day_09 {
    //189. Rotate Array
    //helper function
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    //main function
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];
        int j =0 ;
        for(int i = n-k; i<n; i++){
            temp[j]=nums[i];
            j++;
        }
        for(int i = n-1;i>=k;i--){
            nums[i] = nums[i-k];
        }

        for(int i = 0; i<k; i++){
            nums[i] = temp[i];
        }

        //for O(1) extra space
        // reverse(nums,0,n-1);
        // reverse(nums,0,k-1);
        // reverse(nums,k,n-1);
    }
}
