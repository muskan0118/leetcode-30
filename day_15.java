public class day_15 {
    //88. Merge Sorted Array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j1 = m-1;
        int j2 = n-1;
        for(int i = m+n-1; i>=0;i--){
            if(j1<0 && j2>=0){
                nums1[i]=nums2[j2];
                j2--;
            }
            else if(j2<0){
                break;
            }
            else if(nums1[j1]>nums2[j2]){
                nums1[i] = nums1[j1];
                j1--;
            }
            else{
                nums1[i] = nums2[j2];
                j2--;
            }
        }



        //brute force
        // int k =0;
        // for(int i = m; i<nums1.length; i++){
        //     nums1[i]=nums2[k];
        //     k++;
        // }
        // for(int i =0; i< nums1.length; i++){
        //     for(int j =i+1; j<nums1.length; j++){
        //         if(nums1[i]>nums1[j]){
        //             int temp = nums1[i];
        //             nums1[i] = nums1[j];
        //             nums1[j] = temp;
        //         }
        //     }
        // }
    }
}
