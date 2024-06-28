package medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/01-matrix/description/
public class MatrixleetCode {



    public static void main(String[] args) {
        int mat[][]={{0,0,0},{0,1,0},{1,1,1}};
        int ans[][]=updateMatrix(mat);
        System.out.println(Arrays.deepToString(ans));
    }

    private static int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dist[][]=new int[n][m];

        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    dist[i][j]=0;
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

                if(isSafe(r+1,c,mat) && dist[r+1][c]>dist[r][c]+1){
                    dist[r+1][c]=dist[r][c]+1;
                    queue.add(new int[]{r+1,c});
                }
                if(isSafe(r-1,c,mat) && dist[r-1][c]>dist[r][c]+1){
                    dist[r-1][c]=dist[r][c]+1;
                    queue.add(new int[]{r-1,c});
                }
                if(isSafe(r,c+1,mat) && dist[r][c+1]>dist[r][c]+1){
                    dist[r][c+1]=dist[r][c]+1;
                    queue.add(new int[]{r,c+1});
                }
                if(isSafe(r,c-1,mat) && dist[r][c-1]>dist[r][c]+1){
                    dist[r][c-1]=dist[r][c]+1;
                    queue.add(new int[]{r,c-1});
                }
            }
        }
        return dist;
    }

    private static boolean isSafe(int r, int c, int[][] mat) {
//        if(r<0 || c<0 || r>= mat.length || c>=mat[0].length)
//            return false;
//        return true;
        return r>=0 && r<mat.length && c>=0 && c< mat[0].length;
    }

    //Working solution
    private static int[][] updateMatrixWorking(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0)
            return new int[0][0];

        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int MAX_VALUE = m * n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = MAX_VALUE;
                }
            }
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : directions) {
                int r = cell[0] + dir[0], c = cell[1] + dir[1];
                if (r >= 0 && r < m && c >= 0 && c < n && mat[r][c] > mat[cell[0]][cell[1]] + 1) {
                    queue.offer(new int[]{r, c});
                    mat[r][c] = mat[cell[0]][cell[1]] + 1;
                }
            }
        }

        return mat;
        }


}
