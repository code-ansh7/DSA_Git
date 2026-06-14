import java.util.*;
public class CountZerosAndNonZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
    
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx] = sc.nextInt();
        }

        int countZeros = 0;
        int countNonZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) countZeros++;
            else countNonZeros++;
        }

        System.out.println("Zero's: " + countZeros);
        System.out.println("Non Zero's: " + countNonZeros);

    }
}
