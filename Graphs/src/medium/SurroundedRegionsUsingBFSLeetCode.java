package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegionsUsingBFSLeetCode {

    public static void main(String[] args) {

                char board[][]={
                        {'X', 'X', 'X', 'X'},
                        {'X', 'O', 'O', 'X'},
                        {'X', 'X', 'O', 'X'},
                        {'X', 'O', 'X', 'X'}
        };


//        char board[][]={{'X', 'O', 'X'},
//                        {'O', 'X', 'O'},
//                        {'X', 'O', 'X'}
//        };

        solve(board);
        System.out.println(Arrays.deepToString(board));
    }

    private static void solve(char[][] board) {
        int n= board.length;
        int m=board[0].length;
        int visited[][]=new int[n][m];
        Queue<int[]> queue=new LinkedList<>();
        int directions[][]={{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0;i<m;i++){
            if(board[0][i]=='O' && visited[0][i]==0){
               queue.add(new int[]{0,i});
            }
            if(board[n-1][i]=='O' && visited[n-1][i]==0){
                queue.add(new int[]{n-1,i});
            }
        }

        for(int i=0;i<n;i++){
            if(board[i][0]=='O' && visited[i][0]==0){
                queue.add(new int[]{i,0});
            }

            if(board[i][m-1]=='O' && visited[i][m-1]==0){
                queue.add(new int[]{i,m-1});
            }
        }

        while(!queue.isEmpty()){
            int cell[]= queue.remove();

            int r=cell[0];
            int c=cell[1];

            visited[r][c]=1;

            for(int[] dir:directions){
                int row=r+dir[0];
                int col=c+dir[1];

                if(row>=0 && col>=0 && row<n && col<m
                        && visited[row][col]==0 && board[row][col]=='O'){
                    queue.add(new int[]{row,col});
                }
            }
        }

        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(visited[i][j]!=1 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
}
