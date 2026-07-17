//Used when every duplicate element appears only 2 times and present only one unique element.
import java.util.*;
public class XORsolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];            
        }
        System.out.println("Unique Element: " + result);
    }
}
