import java.util.Scanner;
public class PrefixSum{
    public static void main(String args[]){
        int[] arr = {2,5,1,8,2,9,3};
        int[] prefix = new int[arr.length];
        int left = 2;
        int right = 5;
        int rangeSum = 0;

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
             prefix[i] = prefix[i-1] + arr[i];
        }
        if(left == 0){
            rangeSum = prefix[right];
            System.out.println("Range Sum : " + rangeSum);
        }
        else if(left > 0) {
            rangeSum = prefix[right] - prefix[left-1];
            System.out.println("Range Sum : " + rangeSum);
        }
        else System.out.println("Array index is not Valid!");

    }
}