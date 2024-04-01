package medium;

import java.util.Arrays;

public class AggressiveCows {

    public static void main(String args[]){
        int stalls[]={0,3,4,7,10,9};
        int k=4;
        int answer=aggressiveCows(stalls,k);
        System.out.println(answer);
    }

    private static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[stalls.length-1]-stalls[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canWePlace(stalls,mid,k))
                low=mid+1;
            else
                high=mid-1;
        }
        return high;
    }

    private static boolean canWePlace(int[] stalls, int dist, int cows) {
        int n = stalls.length; //size of array
        int cntCows = 1; //no. of cows placed
        int last = stalls[0]; //position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; //place next cow.
                last = stalls[i]; //update the last location.
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }
}
