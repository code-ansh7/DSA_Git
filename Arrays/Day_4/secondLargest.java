import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < s; i++){
        arr[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int i = 0; i < s; i++){
          if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }

            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];        
            }
    }
    System.out.println("Largest = " + max);
    System.out.println("Second Largest = " + secondMax);
  }
}
