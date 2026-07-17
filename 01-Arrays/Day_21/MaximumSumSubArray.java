import java.util.Scanner;

public class MaximumSumSubArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,1,8,2,9,3};
        // int[] arr = {0, 0, 0, 0, 0, 0};
        int k = 3;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;// for Edge case like [-5,-2,-8,-1] & k = 2
        int left = 0;
        int bestLeft = -1;
        int bestRight = -1;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Approach 1: window Size will automatic change.
            //  while(((right - left) + 1) > k){
            //     sum -= arr[left];
            //     left++;
            //  }
            // if(((right - left) + 1) == k){
            //     if(sum > maxSum){
            //         bestLeft = left;
            //         bestRight = right;
            //         maxSum = sum;
            //     }
            // }
            //Approach 2: When we use vaiable for window size so we will update it.
            int windowsize = ((right - left) + 1);
            while (windowsize > k) {
                sum -= arr[left];
                left++;
                //Window Size will also change when window shrink.
                windowsize = ((right - left) + 1); // Workable in all cases 
                // windowsize -= 1;// Worable , but sometime fails.
            }
            if (windowsize == k) {
                if (sum > maxSum) {
                    bestLeft = left;
                    bestRight = right;
                    maxSum = sum;
                }
            }
        }
        if (bestLeft != -1) {
            System.out.println("Best Window : " + bestLeft + " , " + bestRight);
            System.out.print("Window : ");
            for (int i = bestLeft; i <= bestRight; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nMaximum Sum : " + maxSum);
        } else 
            System.out.println("No valid window found!");
    }
}