package medium;

public class MaximalSquare {

    public static void main(String args[]){
        char matrix[][]={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'}};
        int answer=maximalSquare(matrix);
        System.out.println(answer);
    }

    private static int maximalSquare(char[][] matrix) {
        int ans=0;
        int arr[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0||j==0) {
                    if(matrix[i][j]=='1') {
                        arr[i][j] = 1;
                    }
                }else {
                    if (matrix[i][j] == '1') {
                        arr[i][j] = Math.min(arr[i - 1][j - 1] , Math.min(arr[i][j - 1] , arr[i - 1][j])) + 1;
                    }
                }
                ans=Math.max(ans,arr[i][j]);
            }

        }

        return ans*ans;
    }
}
