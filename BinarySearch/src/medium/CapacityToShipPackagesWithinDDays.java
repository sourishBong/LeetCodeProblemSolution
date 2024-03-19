package medium;

public class CapacityToShipPackagesWithinDDays {

    public static void main(String args[]){
        int weights[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int answer=shipWithinDays(weights,days);
        System.out.println(answer);
    }

    private static int shipWithinDays(int[] weights, int days) {
        int low=max(weights);
        int high=totalSum(weights);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(daysRequired(weights,mid,days))
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }

    private static boolean daysRequired(int[] weights, int mid, int days) {
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                day=day+1;
                load=weights[i];
            }else{
                load=load+weights[i];
            }
        }
        if(day<=days)
            return true;
        else
            return false;
    }

    private static int totalSum(int[] weights) {
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum=sum+weights[i];
        }
        return sum;
    }

    private static int max(int[] weights) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
        }
        return max;
    }
}
