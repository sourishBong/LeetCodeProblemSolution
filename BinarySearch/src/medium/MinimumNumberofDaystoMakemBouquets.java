package medium;

public class MinimumNumberofDaystoMakemBouquets {

    public static void main(String args[]){
        int bloomDay[]={1,10,3,10,2};
        int m=3;
        int k=1;
        int answer=minDays(bloomDay,m,k);
        System.out.println(answer);
    }

    /*
    Time Complexity: O(n * log(high))
    Space Complexity: O(1)
     */
    private static int minDays(int[] bloomDay, int m, int k) {
        int low=min(bloomDay);
        int high=max(bloomDay);

        long val = (long) m * k;
        if(val>bloomDay.length) return -1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    private static boolean possible(int[] bloomDay, int mid, int m, int k) {
        int count=0;
        int noOfB=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }else{
                noOfB=noOfB+(count/k);
                count=0;
            }
        }
        noOfB=noOfB+(count/k);
        return noOfB>=m;
    }

    private static int max(int[] bloomDay) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
        }
        return max;
    }

    private static int min(int[] bloomDay) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min, bloomDay[i]);
        }
          return min;
    }


}
