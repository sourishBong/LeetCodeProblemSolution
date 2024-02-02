package easyProblems;

import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String args[]){
         int[][] image={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] answer =flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(answer));
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int row=0;
        int colStart=0;
        int colEnd=image[0].length-1;
        while(row<image.length){
            while(colStart<=colEnd){
                int temp=image[row][colStart];
                image[row][colStart]=image[row][colEnd];
                image[row][colEnd]=temp;
                colStart++;
                colEnd--;
            }
            colStart=0;
            colEnd=image[0].length-1;
            while(colStart<=colEnd){
                if(image[row][colStart]==1)
                    image[row][colStart]=0;
                else
                    image[row][colStart]=1;
                colStart++;
            }
            colStart=0;
            row++;
        }

        return image;
    }
}
