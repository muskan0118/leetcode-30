public class day_07 {
    //11. Container With Most Water
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int area = 0;
        int max_water = 0;

        while(left<=right){
            if(height[left]<height[right]){
                area = height[left]*(right-left);
                left++;
            }else{
                area = height[right]*(right-left);
                right--;
            }
            max_water = Math.max(area,max_water);
        }
        return max_water;
    }

    //7. Reverse Integer
    public int reverse(int x) {
        int og = Math.abs(x);
        int num = 0;
        while(og>0){
            int digit = og%10;

            //checking the integer overflow
            if(num > Integer.MAX_VALUE / 10 ||
               (num == Integer.MAX_VALUE / 10 && digit > 7)){
                return 0;
            }

            num = num*10 + digit;
            og = og/10;
        }

        if(x<0){
            return -num;
        }else{
            return num;
        }
    }
}
