package medium;

public class NumberofEnclaves {

    public static void main(String args[]) {
//        int grid[][] = {
//                {0, 0, 0, 0},
//                {1, 1, 1, 0},
//                {0, 1, 1, 0},
//                {0, 0, 0, 0}
//        };

        int grid[][] = {
                {0,0,0,1,1,1,0,1,0,0},
                {1,1,0,0,0,1,0,1,1,1},
                {0,0,0,1,1,1,0,1,0,0},
                {0,1,1,0,0,0,1,0,1,0},
                {0,1,1,1,1,1,0,0,1,0},
                {0,0,1,0,1,1,1,1,0,1},
                {0,1,1,0,0,0,1,1,1,1},
                {0,0,1,0,0,1,0,1,0,1},
                {1,0,1,0,1,1,0,0,0,0},
                {0,0,0,0,1,1,0,0,0,1}

        };


        int ans=numEnclaves(grid);
        System.out.println(ans);
    }

    private static int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int visited[][]=new int[n][m];
        int directions[][]={{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0;i<m;i++){
            if(grid[0][i]==1 && visited[0][i]==0){
                dfs(0,i,grid,visited,directions);
            }

            if(grid[n-1][i]==1 && visited[n-1][i]==0){
                dfs(n-1,i,grid,visited,directions);
            }
        }

        for(int i=0;i<n;i++){
            if(grid[i][0]==1 && visited[i][0]==0){
                dfs(i,0,grid,visited,directions);
            }

            if(grid[i][m-1]==1 && visited[i][m-1]==0){
                dfs(i,m-1,grid,visited,directions);
            }
        }

        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int r, int c, int[][] grid, int[][] visited, int[][] directions) {
        visited[r][c]=1;

        for(int[] dir:directions){
            int row=r+dir[0];
            int col=c+dir[1];

            if(row>=0 && col>=0 && row<grid.length && col<grid[0].length &&
             grid[row][col]==1 && visited[row][col]==0){
                dfs(row,col,grid,visited,directions);
            }
        }
    }
}
