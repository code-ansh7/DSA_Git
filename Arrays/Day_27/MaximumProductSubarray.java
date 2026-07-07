public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] arr = { 2, 3, -2, 4, -2 };

        // Brute Force Approach:
        
        // int max = arr[0];    
        // for (int i = 0; i < arr.length; i++) {
        //     int product = 1;
        //     for (int j = i; j < arr.length; j++) {
        //         product *= arr[j];
        //         max = Math.max(max, product);
        //     }
        // }
        // System.out.println("Maximum Product: " + max);


        // Interview Optimal Approach:

        // int currentMax = arr[0];
        // int currentMin = arr[0];
        // int answer = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     int num = arr[i];
        //     int tempMax = currentMax;
        //     currentMax = Math.max(num, Math.max(num * currentMax, num * currentMin));
        //     currentMin = Math.min(num, Math.min(num * tempMax, num * currentMin));
        //     answer = Math.max(answer, currentMax);
        // }
        // System.out.println("Maximum Product: " + answer);


        // Prefix-Suffix Approach:

        int prefix = 1;
        int suffix = 1;
        int answer = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (prefix == 0)
                prefix = 1;// kuki agr array mai 0 hai to aage koi effect na pde.
            if (suffix == 0)
                suffix = 1;

            prefix *= arr[i];
            suffix *= arr[arr.length - 1 - i];

            answer = Math.max(answer, Math.max(prefix, suffix));
        }

        System.out.println("Maximum Product = " + answer);
    }
}