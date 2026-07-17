import java.util.*;
public class MajorityElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        boolean found = false;
        int majorityElement = arr[0];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            boolean alreadyVisited = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    alreadyVisited = true;
                    break;
                }
            }
            if(alreadyVisited) continue;
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " => " + count);
             if(count > arr.length/2){
                found = true;
                majorityElement = arr[i];
             }  
        }
        if(found){
            System.out.println(majorityElement + " is a majority element!");
        }
        else{
            System.out.println("No Majority Element!");
        }
     }
}