import java.util.*;
public class LongestSubArrayWithSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,1,1,1,1,1,4,2,3};
        int k = 6;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum > k) break;
                if(sum == k){
                    int length = 1;
                    length = (j - i) + 1;
                    if(length >  maxLength){
                        maxLength = length;
                    } 
                }      
            }
        }
        System.out.println(maxLength);
    }
}