package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/problems/rotten-oranges2536/1
public class RottenOrangesGFG {

    public static void main(String args[]){
        int grid[][]={{0,1,2},{0,1,2},{2,1,1}};
        int ans=orangesRotting(grid);
        System.out.println(ans);
    }

    private static int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int time=0;
        int freshOranges=0;
        Queue<int[]> queue=new LinkedList<>();

        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j]==1)
                    freshOranges++;
            }
        }

        if(freshOranges==0)
            return 0;
        if(queue.isEmpty())
            return -1;

        while(!queue.isEmpty()){
            int size= queue.size();
            for(int i=0;i<size;i++){
                int cell[]=queue.remove();
                int r=cell[0];
                int c=cell[1];
                if(isSafe(r-1,c,grid) && grid[r-1][c]==1) {
                    grid[r - 1][c] = 2;
                    freshOranges--;
                    queue.add(new int[]{r - 1, c});
                }
                if(isSafe(r+1,c,grid) && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    freshOranges--;
                    queue.add(new int[]{r+1,c});
                }
                if(isSafe(r,c+1,grid) && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    freshOranges--;
                    queue.add(new int[]{r,c+1});
                }
                if(isSafe(r,c-1,grid) && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    freshOranges--;
                    queue.add(new int[]{r,c-1});
                }
                }
            time++;
            }
        if(freshOranges==0)
            return time-1;
      return -1;
    }

    private static boolean isSafe(int r, int c, int[][] grid) {
        if(r<0 || c<0 ||r>=grid.length || c>=grid[0].length)
            return false;
        return true;
    }


}
