package hard;

import java.util.Arrays;

public class Candy {

    public static void main(String args[]){
        int ratings[]={1,0,2};
        int candy=candy(ratings);
        System.out.println(candy);
    }

    private static int candy(int[] ratings) {
        int candies[]=new int[ratings.length];
        Arrays.fill(candies,1);

        //left to right pass
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1])
                candies[i]=candies[i-1]+1;
        }

        //right to left pass
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                candies[i]=Math.max(candies[i+1]+1,candies[i]);
        }

        int sum=0;
        for(int i=0;i<candies.length;i++){
            sum=sum+candies[i];
        }
        return sum;
    }
}
