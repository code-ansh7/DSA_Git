import java.sql.PseudoColumnUsage;
import java.util.*;
public class FrequencyOfOneElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();           
        }
        System.out.print("Enter your target: ");
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) count++;
        }
        System.out.println(target + " appears " + count + " times.");
    }
}
