package medium;

import java.util.Arrays;

public class FindaPeakElementII {

    public static void main(String args[]){
        int mat[][]={{1,4},{3,2}};
        int arr[]=findPeakGrid(mat);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] findPeakGrid(int[][] mat) {
            int arr[]=new int[2];
            Arrays.fill(arr,-1);
            int low=0;
            int high=mat[0].length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                int row=maxElement(mat,mid);
                int left=mid-1>=0? mat[row][mid-1]:-1;
                int right=mid+1<mat[0].length?mat[row][mid+1]:-1;
                if(mat[row][mid]>left && mat[row][mid]>right) {
                    arr[0] = row;
                    arr[1] = mid;
                    break;
                }else if(left>mat[row][mid])
                    high=mid-1;
                else
                    low=mid+1;

            }
            return arr;
    }

    private static int maxElement(int[][] mat, int col) {
        int max=Integer.MIN_VALUE;
        int row=0;
        for(int i=0;i<mat.length;i++){
         //  max=Math.max(max,mat[i][col]);
           if(max<mat[i][col]){
               max=mat[i][col];
               row=i;
           }
        }
        return row;
    }
}
