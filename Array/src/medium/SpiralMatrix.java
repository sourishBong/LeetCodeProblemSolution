package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> answer=spiralOrder(matrix);
        System.out.println(answer);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int r1=0;
        int r2=m-1;
        int c1=0;
        int c2=n-1;

        while(r1<=r2 && c1<=c2){

            //printing first row
            for(int c=c1;c<=c2;c++){
                list.add(matrix[r1][c]);
            }
            r1++;

            for(int r=r1;r<=r2;r++){
                list.add(matrix[r][c2]);
            }
            c2--;

            if(r1<=r2 && c1<=c2) {
                for (int c = c2; c >= c1; c--) {
                    list.add(matrix[r2][c]);
                }
                r2--;

                for (int r = r2; r >= r1; r--) {
                    list.add(matrix[r][c1]);
                }
                c1++;
            }

        }
        return list;
    }
}
