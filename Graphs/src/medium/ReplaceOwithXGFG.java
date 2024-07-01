package medium;

//https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1
import java.util.Arrays;

public class ReplaceOwithXGFG {

    public static void main(String[] args) {
        int n=4;
        int m=5;
//        char a[][]={{'X', 'X', 'X', 'X'},
//                    {'X', 'O', 'X', 'X'},
//                    {'X', 'O', 'O', 'X'},
//                    {'X', 'O', 'X', 'X'},
//                    {'X', 'X', 'O', 'O'}};

        char a[][]={{'X', 'X', 'X', 'X','X'},
                    {'O', 'X', 'X', 'X','O'},
                    {'X', 'X', 'X', 'O','X'},
                    {'X', 'X', 'X','O','O'},
                    };
        char ans[][]=fill(n,m,a);
        System.out.println(Arrays.deepToString(ans));
    }

    private static char[][] fill(int n, int m, char[][] a) {
            int visited[][]=new int[n][m];
            for(int i=0;i<m;i++){
                if(a[0][i]=='O' && visited[0][i]==0){
                    dfs(0,i,visited,a);
                }

                if(a[n-1][i]=='O' && visited[n-1][i]==0){
                    dfs(n-1,i,visited,a);
                }
            }
            for(int i=0;i<n;i++){
                if(a[i][0]=='O' && visited[i][0]==0){
                    dfs(i,0,visited,a);
                }
                if(a[i][m-1]=='O' && visited[i][m-1]==0){
                    dfs(i,m-1,visited,a);
                }
            }

            for(int i=1;i<=n-2;i++){
                for(int j=1;j<=m-2;j++){
                    if(visited[i][j]==0 && a[i][j]=='O'){
                        a[i][j]='X';
                    }
                }
            }
            return a;
    }

    private static void dfs(int r, int c, int[][] visited, char[][] a) {

                if(isSafe(r,c,a) && a[r][c]=='O' && visited[r][c]==0) {
                    visited[r][c]=1;
                    dfs(r + 1, c, visited, a);
                    dfs(r - 1, c, visited, a);
                    dfs(r, c + 1, visited, a);
                    dfs(r, c - 1, visited, a);
                }
    }

    private static boolean isSafe(int r, int c, char[][] a) {
        if(r<0 || c<0 || r>a.length-1 || c>a[0].length-1)
            return false;
        return true;
    }
}
