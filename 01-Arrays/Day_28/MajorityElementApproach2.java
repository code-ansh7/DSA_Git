import java.util.HashMap;

public class MajorityElementApproach2 {
    public static void main(String args[]){
        int[] arr = {2,2,2,1,1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else {
                map.put(arr[i] , 1);
            }
        }
        boolean found = false;
        int majority = -1;
        for(Integer key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
            if(map.get(key) > arr.length/2) {
                majority = key;
                found = true;
            }
        }
        if(found) System.out.println("Majority Element: " + majority);
        else      System.out.println("Majority Element Not Found!");
    }
}