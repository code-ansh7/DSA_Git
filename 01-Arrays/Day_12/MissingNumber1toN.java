import java.util.*;
public class MissingNumber1toN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // for 1 to n(largest element)
        int n = arr.length + 1; 
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];    
        }
        int missingElement = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingElement);
    }
}