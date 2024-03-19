package medium;

public class KokoEatingBananas {

    public static void main(String args[]){
    int piles[]={3,6,7,11};
    int h=8;
    int answer=minEatingSpeed(piles,h);
    System.out.println(answer);
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);


        while(low<=high){
            int mid=low+(high-low)/2;
            int totalHour=calculateTotalHour(piles,mid);
            if(totalHour<=h){
               high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;
    }

    private static int calculateTotalHour(int[] piles, int mid) {
        int totalHour=0;
        for(int i=0;i<piles.length;i++){
            totalHour= (int) (totalHour+Math.ceil((double)piles[i]/(double)mid));
        }
        return totalHour;
    }

    private static int max(int[] piles) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }

}
