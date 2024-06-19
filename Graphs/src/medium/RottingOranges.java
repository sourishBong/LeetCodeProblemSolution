package medium;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/rotting-oranges/
public class RottingOranges {

    public static void main(String args[]){
        int grid[][]={{2,1,1},{1,1,0},{0,1,1}};
        int ans=orangesRotting(grid);
        System.out.println(ans);
    }

    private static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = grid;
        Queue<int[]> q = new LinkedList<>();
        int countFreshOrange = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 2) {
                    q.offer(new int[] {i, j});
                }
                if (visited[i][j] == 1) {
                    countFreshOrange++;
                }
            }
        }
        if (countFreshOrange == 0)
            return 0;
        if (q.isEmpty())
            return -1;

        int minutes = -1;
        int[][] dirs = {{1, 0},{-1, 0},{0, -1},{0, 1}};
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];
                for (int[] dir : dirs) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if (i >= 0 && i < m && j >= 0 && j < n && visited[i][j] == 1) {
                        visited[i][j] = 2;
                        countFreshOrange--;
                        q.offer(new int[] {i, j});
                    }
                }
            }
            minutes++;
        }

        if (countFreshOrange == 0)
            return minutes;
        return -1;
    }

    private static int orangesRottingOld(int[][] grid) {
            int m=grid.length;
            int n=grid[0].length;

            Queue<int[]> queue=new LinkedList<>();
            int freshOranges=0;

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==2){
                        //adding rotten oranges
                        queue.add(new int[]{i,j});
                    }
                    if(grid[i][j]==1){
                        freshOranges++;
                    }
                }
            }

            if(freshOranges==0)
                return 0;
           if(queue.isEmpty())
                return -1;

           int minute=0;
           while(!queue.isEmpty()){
               int size= queue.size();
               for(int i=0;i<size;i++){
                   int[] cell=queue.remove();
                   int x=cell[0];
                   int y=cell[1];
                   if(isSafe(x+1,y) && grid[x+1][y]==1){
                       grid[x+1][y]=2;
                       freshOranges--;
                       queue.add(new int[]{x+1,y});
                   }
                   if(isSafe(x-1,y) && grid[x-1][y]==1){
                       grid[x-1][y]=2;
                       freshOranges--;
                       queue.add(new int[]{x-1,y});
                   }
                   if(isSafe(x,y-1) && grid[x][y-1]==1){
                       grid[x][y-1]=2;
                       freshOranges--;
                       queue.add(new int[]{x,y-1});
                   }
                   if(isSafe(x,y+1) && grid[x][y+1]==1){
                       grid[x][y+1]=2;
                       freshOranges--;
                       queue.add(new int[]{x,y+1});
                   }
               }
               minute++;
           }
           if(freshOranges==0){
               return minute-1;
           }
           return -1;
    }

    public static boolean isSafe(int x,int y/*,int r,int c*/){
        return (x>=0 && y>=0 /*&& x<r && y<c*/);
    }
}
