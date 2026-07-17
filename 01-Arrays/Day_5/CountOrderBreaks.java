import java.util.*;
public class CountOrderBreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx] = sc.nextInt();
        }
         int count = 0;
        for (int idx = 0; idx < arr.length - 1; idx++) {
             if(arr[idx] > arr[idx + 1]){
                 count++;
             }
        }
        System.out.println("Loop is break " + count + " times!");
    }
}
