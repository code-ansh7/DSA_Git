import java.util.*;
public class Reverse_array_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx] = sc.nextInt();
        }

        System.out.print("Your Reverse Array: ");
        for (int idx = arr.length-1; idx >= 0; idx--) {
            System.out.print(arr[idx] + " ");
         }

    }
}
