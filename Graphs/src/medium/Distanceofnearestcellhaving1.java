package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/problems/distance-of-nearest-cell-having-1-1587115620/1
public class Distanceofnearestcellhaving1 {

    public static void main(String[] args) {
        int grid[][]={{0,1,1,0},{1,1,0,0},{0,0,1,1}};
        int ans[][]=nearest(grid);
        System.out.println(Arrays.deepToString(ans));
    }

    private static int[][] nearest(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dist[][]=new int[n][m];
        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    dist[i][j]=1;
                    queue.add(new int[]{i,j});
                }else{
                    dist[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int cell[]=queue.remove();
                int r=cell[0];
                int c=cell[1];

                if(isSafe(r+1,c,grid) && dist[r+1][c]>dist[r][c]+1){
                    dist[r+1][c]=dist[r][c]+1;
                    queue.add(new int[]{r+1,c});
                }
                if(isSafe(r-1,c,grid) && dist[r-1][c]>dist[r][c]+1){
                    dist[r-1][c]=dist[r][c]+1;
                    queue.add(new int[]{r-1,c});
                }
                if(isSafe(r,c+1,grid) && dist[r][c+1]>dist[r][c]+1){
                    dist[r][c+1]=dist[r][c]+1;
                    queue.add(new int[]{r,c+1});
                }
                if(isSafe(r,c-1,grid) && dist[r][c-1]>dist[r][c]+1){
                    dist[r][c-1]=dist[r][c]+1;
                    queue.add(new int[]{r,c-1});
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=dist[i][j]-1;
            }
        }
        return dist;
    }

    private static boolean isSafe(int r, int c, int[][] grid) {
        if(r<0 || c<0 || r>= grid.length || c>=grid[0].length)
            return false;
        return true;
    }

}

