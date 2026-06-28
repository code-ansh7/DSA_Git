import java.util.*;
public class SlidingWindowBasic {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,1};
        int k = 3;
        int sum = 0;
        int left = 0;
        int maxLength = 0; // because k != window sum is possible
        for(int right = 0; right < arr.length; right++){
            sum += arr[right];
            while(sum > k){
                sum = sum - arr[left];// remove left element
                left++;               //Decreasing window size 
            }
            if(sum == k){
                int length = (right - left) + 1;
                if(length > maxLength){
                    maxLength = length;
                }
            }
        }
        System.out.println(maxLength);
    }
}
