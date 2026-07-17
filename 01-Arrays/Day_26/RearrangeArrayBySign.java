public class RearrangeArrayBySign{
    public static void main(String[] args) {
        int[] arr = {3 ,-2, 1, -5, 2, -4};

        int[] ans = new int[arr.length];
        int positiveIndex = 0;
        int negativeIndex = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                ans[positiveIndex] = arr[i];
                positiveIndex += 2;
            } else {
                ans[negativeIndex] = arr[i];
                negativeIndex += 2;
            }
        }
        for(int i = 0; i < ans.length; i++){ 
            System.out.print(ans[i] + " ");
        }
    } 
}