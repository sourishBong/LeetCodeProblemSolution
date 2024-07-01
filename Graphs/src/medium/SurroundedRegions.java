package medium;

// https://leetcode.com/problems/surrounded-regions/
import java.util.Arrays;

public class SurroundedRegions {

    public static void main(String[] args) {
        int n=4;
        int m=5;

//        char board[][]={{'X', 'X', 'X', 'X'},
//                        {'X', 'O', 'O', 'X'},
//                        {'X', 'X', 'O', 'X'},
//                        {'X', 'O', 'X', 'X'}
//        };

        char board[][]={{'X', 'O', 'X'},
                        {'O', 'X', 'O'},
                        {'X', 'O', 'X'}
        };

        solve(board);
        System.out.println(Arrays.deepToString(board));
    }

    private static void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;

        int visited[][]=new int[n][m];

        int directions[][]={{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0;i<m;i++){
            if(board[0][i]=='O' && visited[0][i]==0){
                dfs(0,i,board,visited,directions);
            }
            if(board[n-1][i]=='O' && visited[n-1][i]==0){
                dfs(n-1,i,board,visited,directions);
            }
        }

        for(int i=0;i<n;i++){
            if(board[i][0]=='O' && visited[i][0]==0){
                dfs(i,0,board,visited,directions);
            }

            if(board[i][m-1]=='O' && visited[i][m-1]==0){
                dfs(i,m-1,board,visited,directions);
            }
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                if(board[i][j]=='O' && visited[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
    }

    private static void dfs(int r, int c, char[][] board, int[][] visited, int[][] directions) {
        visited[r][c]=1;
        for(int[] dir:directions){
            int row=r+dir[0];
            int col=c+dir[1];
            if(row>=0 && col>=0 && row<board.length && col<board[0].length
            && visited[row][col]==0 && board[row][col]=='O'){
                visited[row][col]=1;
                dfs(row,col,board,visited,directions);
            }
        }
    }
}
