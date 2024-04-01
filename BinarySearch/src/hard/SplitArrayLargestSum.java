package hard;

public class SplitArrayLargestSum {

    public static void main(String args[]){
        int nums[]={7,2,5,10,8};
        int k=2;
        int answer=splitArray(nums,k);
        System.out.println(answer);
    }

    private static int splitArray(int[] nums, int k) {
       int low=0;
       int high=0;
       for(int i=0;i<nums.length;i++){
           low=Math.max(low,nums[i]);
           high=high+nums[i];
       }
       while(low<=high){
           int mid=low+(high-low)/2;
           int count=checkCount(nums,mid);
           if(count>k)
               low=mid+1;
           else
               high=mid-1;
       }
       return low;
    }

    private static int checkCount(int[] nums, int mid) {
        int count=1;
        int total=0;
        for(int i=0;i<nums.length;i++){
            if(total+nums[i]<=mid){
                total=total+nums[i];
            }else{
                count++;
                total=nums[i];
            }
        }
        return count;
    }
}
