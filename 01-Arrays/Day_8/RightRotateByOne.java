import java.util.Scanner;

public class RightRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter '5' array elements: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[arr.length-1];
         for(int i = arr.length-1; i >=1; i--){
             arr[i] = arr[i-1];
         }
        arr[0] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");    
        }
     }
}
