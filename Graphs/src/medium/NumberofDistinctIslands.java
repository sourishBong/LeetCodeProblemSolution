package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberofDistinctIslands {

    public static void main(String[] args) {
        int grid[][]={
                  {1, 1, 0, 1, 1},
                  {1, 0, 0, 0, 0},
                  {0, 0, 0, 0, 1},
                  {1, 1, 0, 1, 1}
        };

        int ans=countDistinctIslands(grid);
        System.out.println(ans);
    }

    private static int countDistinctIslands(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int visited[][]=new int[n][m];
        int directions[][]={{1,0},{-1,0},{0,1},{0,-1}};
        Set<List<Integer>> result=new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    List<Integer> list=new ArrayList<>();
              dfs(i,j,grid,visited,i,j,list,directions);
                    result.add(list);
                }
            }
        }
        return result.size();
    }

    private static void dfs(int r, int c, int[][] grid, int[][] visited,
                             int baseRow,int baseColumn,List<Integer> list,int[][] directions) {
        visited[r][c]=1;
       list.add(r-baseRow);
       list.add(c-baseColumn);

        for(int[] dir:directions){
            int row=r+dir[0];
            int column=c+dir[1];

            if(row>=0 && column>=0 && row<grid.length && column<grid[0].length &&
            visited[row][column]==0 && grid[row][column]==1){
              dfs(row,column,grid,visited,baseRow,baseColumn,list,directions);
            }
        }
    }

}
