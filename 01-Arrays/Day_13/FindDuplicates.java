import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyVisited = false;
            int count = 0;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    alreadyVisited = true;
                    break;
                }
                
            }
            if(alreadyVisited) continue;

            for(int k = 0; k < arr.length; k++){
                if(arr[i] == arr[k]) count++;
            }
                 if(count > 1)
                    System.out.print(arr[i] + " ");            
        }
    }
}