package medium;

public class SearchA2DMatrix {

    public static void main(String args[]){
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        boolean answer=searchMatrix(matrix,target);
        System.out.println(answer);
    }

    /*
    Time Complexity: O(r + c)
     */
    //since this is sorted
    private static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target)
                return true;
            else if(matrix[r][c]>target)
                c--;
            else
                r++;
        }
        return false;
    }
}
