package medium;

public class Searcha2DMatrix {

    public static void main(String args[]){
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
//        int matrix[][]={{1,4},{2,5}};
//        int target=2;
        boolean answer=searchMatrix(matrix,target);
        System.out.println(answer);
    }

    /*
    Time Complexity: O(log(n*m))
    Space Complexity: O(1)
     */
    private static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n*m-1;
        while(low<=high){
            int mid=(high+low)/2;
            int row=mid/m;
            int column=mid%m;
            if(matrix[row][column]==target) return true;
            else if(matrix[row][column]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
