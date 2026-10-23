public class day_23 {
    //58. Length of Last Word
    public int lengthOfLastWord(String s) {
        s =  s.trim();
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i = arr.length-1 ; i>=0; i--){
            if(arr[i]==' '){
                break;
            }else{
                count++;
            }
        }
        return count;
    }

    //1295. Find Numbers with Even Number of Digits
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0; i< nums.length; i++){
            int num = nums[i];
            int count = 0;
            while(num>0){
                num = num /10;
                count++;
            }

            if((count&1)==0){
                ans++;
            }
        }
        return ans;
        
    }

}
