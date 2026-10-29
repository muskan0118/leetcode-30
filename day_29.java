import java.util.Arrays;

public class day_29 {
    //41. First Missing Positive
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int min = 1;
        for (int a : nums) {
            if (a < min) {
                continue;
            }
            if (a == min) {
                min++;
            }
        }
        return min;
    }
    
}
