package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/k-closest-points-to-origin/description/
public class KClosestPointstoOrigin {

    public static void main(String args[]){
        int points[][]={{1,3},{-2,2}};
        int k=1;
        int ans[][]=kClosest(points,k);
        System.out.println(Arrays.deepToString(ans));
    }

    private static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<points.length;i++){
                int x=points[i][0]*points[i][0];
                int y=points[i][1]*points[i][1];
                int dist=x+y;
                maxHeap.add(new Point(points[i][0],points[i][1],dist,i));
                if(maxHeap.size()>k){
                    maxHeap.remove();
                }

        }
       int[][] ans=new int[k][k];
        for(int i=0;i<k;i++){
            Point point=maxHeap.remove();
            ans[i]=new int[]{
                  points[point.i][0],
                  points[point.i][1]
            };
        }
       return ans;
    }
}
