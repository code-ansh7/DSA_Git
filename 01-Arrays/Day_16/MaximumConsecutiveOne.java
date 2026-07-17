import java.util.Scanner;
public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();            
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else count = 0;            
        }
        System.out.println("1's Streak: " + max);
    }
}
