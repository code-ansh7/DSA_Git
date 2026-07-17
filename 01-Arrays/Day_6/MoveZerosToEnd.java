import java.util.*;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx] = sc.nextInt();
        }

        int pos = 0;
        for(int i = 0; i < arr.length; i++){ //move non zero in left side
            if(arr[i] != 0){
                arr[pos] = arr[i];
                pos++;
            }
        }

        for(int i = pos; i < arr.length; i++){// add 0 pos to end
            arr[i] = 0;
        }

        System.out.println("Your array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
