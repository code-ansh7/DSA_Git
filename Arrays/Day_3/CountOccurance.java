import java.util.*;
public class CountOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();            
        }
        System.out.print("Enter element :");
        int target = sc.nextInt();
        int count = 0;
        boolean found = false;
        int index = -1;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] == target){
                count++;
            }            
        } 
        System.out.println(target + " present in Array " + count + " times.");  
    }
}
