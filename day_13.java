public class day_13 {
    //509. Fibonacci Number
    public int fib(int n) {
        if(n==1||n==0){
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i<=n; i++){
            c = a + b;
            a=b;
            b=c;
        }
        return c;
        //using recursion
        // return fib(n-1) + fib(n-2);
    }

    //162. Find Peak Element
     public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }

        //Why check the boundaries separately because the first element has no left neighbour, and the last element has no right neighbour.
        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        for(int i = 1; i<n-1; i++){
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                return i;
            }
        }
        return -1;
        
        //using binary search
        // int ans = -1;
        // int start = 0;
        // int end = nums.length -1;

        // while(start<end){
        //     int mid = start + (end-start)/2;
           
        //     if(nums[mid]>nums[mid+1]){
        //         end = mid;
        //     }else{
        //         start = mid+1;
        //     }
        // }
       
        // return end;
    }
}
