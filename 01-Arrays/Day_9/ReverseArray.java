import java.util.*;
public class ReverseArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length-1;
            while(left < right){
                int temp  = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
        }
    }
}
