public class day_26 {
    //231. Power of Two
    public boolean isPowerOfTwo(int n) {
        //without loops
        return (n>0 && (n&(n-1))==0);

        //with loops
        // long num = 1;
        // if(n==num){
        //     return true;
        // }
        // while(n>num){
        //     num = num*2;
        // }
        // return n==num;
    }

    //905. Sort Array By Parity
    public int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for(int i = 0; i< nums.length; i++){
            if((nums[i]&1)==0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return nums;
        
    }
}
