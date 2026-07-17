import java.util.*;
public class Array_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx] = sc.nextInt();
        }

        System.out.print("Your Array: ");
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
         }

    }
}
