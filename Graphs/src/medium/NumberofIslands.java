package medium;

//https://leetcode.com/problems/number-of-islands/description/
public class NumberofIslands {
    private static int n;
    private static int m;
    public static void main(String args[]){
        char grid[][]={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'}
                ,{'0','0','0','0','0'}};
        int ans=numIslands(grid);
        System.out.println(ans);
    }

    private static int numIslands(char[][] grid) {
         n=grid.length;
         m=grid[0].length;
        //int visited[][]=new int[n][m];
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(/*visited[i][j]==0 &&*/ grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count++;
    }

    private static void dfs(int i, int j,  char[][] grid) {

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';

                    dfs(i+1,j,grid);
                    dfs(i-1,j,grid);
                    dfs(i,j+1,grid);
                    dfs(i,j-1,grid);
                }
}
