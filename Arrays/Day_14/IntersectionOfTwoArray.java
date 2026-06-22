import java.util.*;
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter first araay elements: ");
        for (int i = 0; i < arr1.length; i++) {
             arr1[i] = sc.nextInt();
        }
        System.out.print("Enter second array size: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter second araay elements: ");
        for (int i = 0; i < arr2.length; i++) {
             arr2[i] = sc.nextInt();
        }
        int n3 = (Math.min(arr1.length,arr2.length));
        int[] arr3 = new int[n3];
        int pos = 0;
        System.out.print("Intersection of arr1 and arr2: ");
        for (int i = 0; i < arr1.length; i++) {
            boolean visited = false;
            for(int j = 0; j < i; j++){
                if(arr1[i] == arr1[j]){
                    visited = true;
                    break;
                }
            }
            if(visited) continue;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    arr3[pos] = arr1[i];
                    pos++;
                    break;
                }
            }
        }
        for(int j = 0; j < pos; j++) System.out.print(arr3[j] + " ");
    }
}
