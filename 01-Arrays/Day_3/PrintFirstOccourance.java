import java.util.*;
public class PrintFirstOccourance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();            
        }

        System.out.print("Enter element to Search: ");
        int target = sc.nextInt();

        boolean found = false;
        int index = -1;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] == target){
                found = true;
                index = idx;
                break;
            }            
        }
         if(found){
            System.out.println(target + " Found in " + index + "th Index!");
        }
        else{
            System.out.println(target + " Not found in array!");
        }    
    }
}
