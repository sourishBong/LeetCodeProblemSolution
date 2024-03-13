package hard;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String args[]){
        int n=4;
        List<List<String>> answer=solveNQueens(n);
        System.out.println(answer);
    }
    /*
    Time Complexity: O(N!)
    Space Complexity: O(N^2)
    */
    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char board[][]=new char[n][n];
////        for(int i=0;i<n;i++){
////           for(int j=0;j<n;j++){
////               board[i][j]='.';
////           }
//        }
        recursiveQueens(result,board,n,0);
        return result;
    }

    private static void recursiveQueens(List<List<String>> result, char[][] list, int n, int col) {
        if(col==n) {
            saveBoard(result, list);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,list,n)){
                list[row][col]='Q';
                recursiveQueens(result,list,n,col+1);
                list[row][col]='.';
            }
        }
    }

    private static void saveBoard(List<List<String>> result, char[][] board) {
        List<String> l = new ArrayList<>();

         for(int i=0; i<board.length; i++){
             String str="";
             for(int j=0; j<board[0].length; j++){
                 if(board[i][j]=='Q'){
                     str+="Q";
                 } else{
                     str +=".";
                 }
             }
             l.add(str);
         }
         result.add(l);
    }

    private static boolean isSafe(int row, int col, char[][] list, int n) {
        int dupRow=row;
        int dupCol=col;
        while(row>=0 && col>=0){
            if(list[row][col]=='Q') return false;
            row--;
            col--;
        }
        row=dupRow;
        col=dupCol;
        while(col>=0){
            if(list[row][col]=='Q') return false;
            col--;
        }
        row=dupRow;
        col=dupCol;
        while(row<=n-1 && col>=0){
            if(list[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
}
