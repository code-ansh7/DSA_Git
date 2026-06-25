import java.util.Scanner;
public class LongestConsicutiveIncreasingSubarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();            
        }

        int currentLength = 1;// kuki single element bhi increasing subarray hai jo ki count hoga 
        int maxLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                currentLength++;
            }else{
                currentLength = 1;
            }
            if(currentLength > maxLength){
                maxLength = currentLength;
            }           
        }
        System.out.println("Longest Increasing Subarray Streak: " + maxLength);
    }
}
