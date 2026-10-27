public class day_27 {
    //204. Count Primes
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }

        int count = 0;
        boolean[] prime = new boolean[n];
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i< n;i ++){
            if(!prime[i]){
                for(int j = i * 2; j < n; j+=i){
                    prime[j]=true;
                }
            }
        }

        for(boolean check: prime){
            if(!check){
                count++;
            }
        }
        return count;

        //alt. --> more efficent
//     for (int i = 2; (long) i * i < n; i++) {
//     if (!prime[i]) {
//         for (int j = i * i; j < n; j += i) {
//             prime[j] = true;
//         }
//     }
//     }

    //brute force
    //     if(n<=2){
    //         return 0;
    //     }
    
    //     int count = 0;
    //     for(int i = 2; i<n;i++){
    //         boolean check = true;
    //         for(int j = 2; j<i;j++){
    //             if(i%j==0){
    //                 check = false;
    //                 break;
    //             }
    //         }
    //         if(check){
    //             count++;
    //         }
            
    //     }
    //     return count;
    }
}
