package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String args[]){
        int intervals[][]={{1,3},{2,6},{8,10},{15,18}};
        int answer[][]=merge(intervals);
        System.out.println(answer);
    }

    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(o1,o2)->o1[0]-o2[0]);
        List<int[]> ans  =  new ArrayList<>();
        int start  =  intervals[0][0];
        int end =  intervals[0][1];

        int  i =1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
            // next interval start is smaller than prev end and array is sorted
            // so these two internal can merge
            if( s<=end  ) {
                // so merge both intervals
                end =  Math.max(end,e);
            }else{ // if merge not possible , then insert prev interval into list
                ans.add(new int[]{start,end});
                start = s;
                end =  e;
            }
            i++;
        }
        ans.add(new int[] {start,end});
        return ans.toArray(new int[0][]);
    }
}
