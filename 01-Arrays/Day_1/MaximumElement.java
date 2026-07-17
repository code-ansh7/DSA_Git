import java.util.*;
public class MaximumElement {
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
    for(int i = 0; i < s; i++){
        if(max < arr[i]){
            max = arr[i];
        }
    }
    System.out.println("Your maximum element : " + max);
  }
}
