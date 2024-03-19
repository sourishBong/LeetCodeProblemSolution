package easy;

public class BestTimetoBuyandSellStock {

    public static void main(String args[]){
       //int prices[]={7,1,5,3,6,4};
       int prices2[]={2,1,4};
        int answer=maxProfit(prices2);
        System.out.println(answer);
    }

    private static int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }

    //Approach1
    private static int maxProfitOneApproach(int[] prices) {
        int left = 0, right = 1,max = 0;
        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }else if(prices[left] < prices[right]){
                max = Math.max(max,(prices[right] - prices[left]));
            }
            right++;
        }
        return max;
    }
}
