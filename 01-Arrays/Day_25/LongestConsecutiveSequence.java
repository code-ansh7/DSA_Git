
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    public static void main(String args[]) {
        int[] arr = { 100, 4, 200, 3, 5, 2 };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int maxLength = 0;
        int bestStartValue = 0;
 
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int length = 1;

            if (set.contains(current - 1)) {// agr previous exist krta hai mtlb starting sequence element nhi hai
                continue;
            }
            // starting sequence element hai
             while (set.contains(current + 1)) {
                current++;
                length++;
             }

            // if (!(set.contains(current - 1))) {
            // current = arr[i];

            // while (set.contains(current + 1)) {
            // current++;
            // length++;
            // }
            // }
            if (length > maxLength) {
                maxLength = length;
                bestStartValue = arr[i];
            }
        }
        System.out.println("Longest Length : " + maxLength);
         
        for (int i = 0; i < maxLength; i++) {    
            System.out.print((bestStartValue++) + " ");
        }
    }
}