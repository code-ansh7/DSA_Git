public class KadanesAlgorithm {

    public static void main(String[] args) {

        int[] arr = {2,3,-8,7,-1,2,3};
        // int[] arr = {4,-2,5,-1,6};

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Current Window
        int currentStart = 0;

        // Best Window
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 0; i < arr.length; i++) {

            currentSum += arr[i];

            // New Maximum Found
            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = currentStart;  
                bestEnd = i;
            }

            // Reset Window
            if (currentSum < 0) {
                currentSum = 0;
                currentStart = i + 1;      
            }
        }

        System.out.println("Maximum Sum : " + maxSum);

        System.out.print("Subarray : ");

        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}