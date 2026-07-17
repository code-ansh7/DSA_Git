import java.util.Scanner;

public class MaximumSumSubArrayBruteForce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 5, 1, 8, 2, 9, 3};
        int k = 3;

        int maxSum = 0;
        int bestLeft = -1;
        int bestRight = -1;

        for (int i = 0; i <= arr.length - k; i++) {

            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                bestLeft = i;
                bestRight = i + k - 1;
            }
        }

        if (bestLeft != -1) {
            System.out.println("Best Window : " + bestLeft + " , " + bestRight);

            System.out.print("Window : ");
            for (int i = bestLeft; i <= bestRight; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println("\nMaximum Sum : " + maxSum);
        } else {
            System.out.println("No valid window found!");
        }
    }
}