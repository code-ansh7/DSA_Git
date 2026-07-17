import java.util.*;
public class MinimumElement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < s; i++){
        arr[i] = sc.nextInt();
    }
    int min = arr[0];
    for(int i = 0; i < s; i++){
        if(min > arr[i]){
            min = arr[i];
        }
    }
    System.out.println("Your minimum element : " + min);
    }
}
