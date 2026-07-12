
public class MooresVotingAlgorithm {

    public static void main(String args[]) {
        int[] arr = {1, 2, 1, 3, 1, 2, 2, 2};
        // int[] arr = {1,2,3,4,5,6};
        // int arr[] = {1,1,1,1,1,1};

        int condidate1 = 0;
        int condidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        //Phase 1: Find Condidate1 & Condidate2 with Maximum Votes
        for (int i = 0; i < arr.length; i++) {

            if (condidate1 == arr[i]) {
                count1++;
            } else if (condidate2 == arr[i]) {
                count2++;
            } else if (count1 == 0) {
                condidate1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                condidate2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }

        }
        // Phase 2: Count Frequencies
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == condidate1) {
                count1++;
            }
            if (arr[i] == condidate2) {
                count2++;
            }
        }
        // Phase 3: Check Majority & Print 
        boolean found = false;
        System.out.print("Majority Elements : ");

        if (count1 > arr.length / 3) {
            System.out.print(condidate1 + " ");
            found = true;
        }

        if (condidate2 != condidate1 && count2 > arr.length / 3) {
            System.out.print(condidate2 + " ");
            found = true;
        }
        if(!found) System.out.println("No Majority Element");
    }
}