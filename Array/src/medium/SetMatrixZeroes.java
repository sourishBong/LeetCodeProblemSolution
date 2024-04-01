package medium;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String args[]){
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean row0=false;
        boolean column0=false;

        //checking all rows in 0th column for 0
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0)
                column0=true;
        }

        //checking all column for 0th row for 0
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0)
                row0=true;
        }

        //checking for the other columns and rows
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++) {
            for (int j = 1; j < m; j++) {
                if(matrix[0][j]==0 || matrix[i][0]==0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(row0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }

        if(column0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}
