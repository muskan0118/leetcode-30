public class day_3 {

    //66. Plus One
    public int[] plusOne(int[] digits) {

        int carry = 1; //because intitlallhy we beed to add 1

        for(int i = digits.length-1; i>=0; i--){
            int sum = digits[i] + carry;
            if(sum>9){
                digits[i]=0;
                carry = 1;
            }
            else{
                digits[i]++;
                carry = 0;
                return digits;
            }
        }

        //if we came out of the loop means we have a carry 1 and all previous digits are 0
        int[] ans = new int[digits.length+1]; //initailzes all elements to zero
        ans[0] = 1;
        return ans;
    }

    
}
