package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/problems/distance-of-nearest-cell-having-1-1587115620/1
public class DistanceFromNearestCellHaving1GFGGeneric {

    public static class Pair{
        int i=0;
        int j=0;
        int k=0;

        public Pair(int i, int j, int k) {
            this.i = i;
            this.j = j;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        int grid[][]={{0,0,0},{0,1,0},{1,0,1}};
        int ans[][]=nearest(grid);
        System.out.println(Arrays.deepToString(ans));
    }

    //this is the solution for leetcode
    private static int[][] nearest(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int vis[][]=new int[n][m];
        int dist[][]=new int[n][m];

        Queue<Pair> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    vis[i][j]=1;
                    dist[i][j]=0;
                    queue.add(new Pair(i,j,0));
                }else{
                    dist[i][j]=-1;
                }
            }
        }

        int diredtions[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            Pair p= queue.remove();
            int r=p.i;
            int c=p.j;
            int d=p.k;
            for(int[] dir:diredtions){
               int row=r+dir[0];
               int col=c+dir[1];

               if(!(row<0 || col<0 || row>=grid.length || col>=grid[0].length) && vis[row][col]==0){
                   dist[row][col]=d+1;
                   vis[row][col]=1;
                   queue.add(new Pair(row,col,d+1));
               }
            }
        }
        return dist;
    }

    //this is for GeekForGeeks
    private static int[][] nearestOld(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int vis[][]=new int[n][m];
        int dist[][]=new int[n][m];

        Queue<Pair> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    vis[i][j]=1;
                    dist[i][j]=0;
                    queue.add(new Pair(i,j,0));
                }else{
                    dist[i][j]=-1;
                }
            }
        }

        while(!queue.isEmpty()){
            int size= queue.size();
            for(int i=0;i<size;i++){
                Pair p= queue.remove();
                int r=p.i;
                int c=p.j;
                int d=p.k;

                int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};

                if(isSafe(r+1,c,grid) && vis[r+1][c]==0){
                    vis[r+1][c]=1;
                    dist[r+1][c]=d+1;
                    queue.add(new Pair(r+1,c,d+1));
                }
                if(isSafe(r-1,c,grid) && vis[r-1][c]==0){
                    vis[r-1][c]=1;
                    dist[r-1][c]=d+1;
                    queue.add(new Pair(r-1,c,d+1));
                }
                if(isSafe(r,c+1,grid) && vis[r][c+1]==0){
                    vis[r][c+1]=1;
                    dist[r][c+1]=d+1;
                    queue.add(new Pair(r,c+1,d+1));
                }
                if(isSafe(r,c-1,grid) && vis[r][c-1]==0){
                    vis[r][c-1]=1;
                    dist[r][c-1]=d+1;
                    queue.add(new Pair(r,c-1,d+1));
                }
            }
        }

        return dist;
    }

    private static boolean isSafe(int r, int c, int[][] grid) {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)
            return false;
        return true;
    }
}
