import java.util.*;
public class Array_sum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    int sum = 0;
    for(int i = 0; i < s; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Sum of array element : ");
    for(int i = 0; i < s; i++){
         sum = sum + arr[i];
    }
    System.out.println("Sum of Array element: " + sum);
   } 
}
