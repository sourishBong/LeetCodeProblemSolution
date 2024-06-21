package medium;

import java.util.Arrays;

public class FloodfillAlgorithmGFG {

    public static void main(String args[]){
        int image[][]={{0,0,0},{0,0,0}};
        int sr=0;
        int sc=0;
        int newColor=0;
        int ans[][]=floodFill(image,sr,sc,newColor);
        System.out.println(Arrays.deepToString(ans));
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int ans[][]=image;
        int currColor=image[sr][sc];
        boolean visited[][]=new boolean[image.length][image[0].length];
        dfs(ans,sr,sc,image,newColor,currColor,visited);
        return ans;
    }

    private static void dfs(int[][] ans, int sr, int sc, int[][] image, int newColor,int currColor
    ,boolean visited[][]) {
        if(sr<0 || sc<0 || sr>=image.length ||sc>=image[0].length || ans[sr][sc]!=currColor || visited[sr][sc])
            return;
        ans[sr][sc]=newColor;
        visited[sr][sc]=true;
        dfs(ans,sr+1,sc,image,newColor,currColor,visited);
        dfs(ans,sr-1,sc,image,newColor,currColor,visited);
        dfs(ans,sr,sc-1,image,newColor,currColor,visited);
        dfs(ans,sr,sc+1,image,newColor,currColor,visited);

    }
}
