import java.util.*;
public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter '5' array elements: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
         for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
         }
        arr[arr.length-1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");    
        }
    }
}
