import java.util.Scanner;

public class LeftRotateByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter '5' array elements: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter hoe many Rotation You want to peroform: ");
        int r = sc.nextInt();

        r = r % arr.length;

        int count = 0;
        for(int j = 1; j <= r; j++){
            int temp = arr[0];
            for(int i = 0; i < arr.length-1; i++){
                arr[i] = arr[i+1];
             }
        arr[arr.length-1] = temp;
        count++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");    
        }
        System.out.println("\nArray perform " + count + " Rotations.");
    }
}
