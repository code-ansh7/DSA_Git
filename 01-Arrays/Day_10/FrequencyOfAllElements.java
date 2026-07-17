import java.util.*;
public class FrequencyOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();           
        }
        for(int i = 0; i < arr.length; i++){
            boolean visited = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    visited = true;
                    break;
                }
            }
            if(visited){
                continue;
            }else{
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i] == arr[j]) count++;
                }
                System.out.println(arr[i] + " => " + count);
            }
            
        }
    }
}
