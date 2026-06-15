import java.util.*;
public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx] = sc.nextInt();
        }

        int pos = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[pos] = arr[i];
                pos++;
            }
        }

        System.out.println("Your array is: ");
        for(int i = 0; i < pos; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
