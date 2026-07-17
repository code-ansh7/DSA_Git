// Que : Find Any Subarray Whose Sum is K ?

import java.util.HashMap;

public class SubarraySumUsingPrefixHashMap {
    public static void main(String aargs[]){
        int[] arr = {3,4,-7,1,3,3,1,-4};
        int k = 7;
        int left = -1;
        int right = -1;

        int need = -1;
        HashMap<Integer,Integer> hp = new HashMap<>();

        int prefix = 0;
        for (int i = 0; i < arr.length; i++) {
             prefix = prefix + arr[i];
             if(prefix == k){
                left = 0;
                right = i;
                // break;  // agr first subarray print karana ho.
             }
             need = prefix - k;
            if( hp.containsKey(need)){
                left = hp.get(need) + 1;
                right = i;
                // break;  // agr first subarray print karana ho.
            }  
                hp.put(prefix,i);
        }
        if(left != 1){
            for(int i = left; i <= right;i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Subarray not found!");
        }
    }
}
