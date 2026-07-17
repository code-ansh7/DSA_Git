import java.util.*;
public class SingleElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,2,1,7,8,4,2};

        for(int i = 0; i < arr.length; i++){
            boolean visited = false;
            for (int j = 0; j < i; j++) {
                 if(arr[i] == arr[j]){
                    visited = true;
                    break;
                 }
            }
            if(visited) continue;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                 if(arr[i] == arr[j]){
                    count++;
                 }
            }
            
             if(count == 1) {
                System.out.println("Unique element: " + arr[i]);
             }
        }
    }
}
