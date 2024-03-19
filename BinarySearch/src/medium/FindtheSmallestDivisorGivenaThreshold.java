package medium;

public class FindtheSmallestDivisorGivenaThreshold {

    public static void main(String args[]){
        int nums[]={21212,10101,12121};
        int thresold=1000000;
        int answer=smallestDivisor(nums,thresold);
        System.out.println(answer);
    }

    //optimized
    /*
    Time Complexity: O(n * log(high))
    Space Complexity: O(1)
     */
    private static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int num : nums) high = Math.max(num,high);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int total = 0;
            for(int num : nums) {
                //to find ceil value
                total += (num + mid - 1) / mid;
            }
            if(total > threshold) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    private static int smallestDivisorNeedMoreOptimized(int[] nums, int thresold) {
//        int low=min(nums);
//        int high=max(nums);
        int low=1;
        //given the highest thresold in question
        int high=1000000;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,mid,thresold))
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }

    private static boolean possible(int[] nums, int mid, int thresold) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum= (int) (sum+Math.ceil((double)nums[i]/(double) mid));
        }
        if(sum<=thresold)
            return true;
        else
            return false;
    }

    private static int max(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
//
//    private static int min(int[] nums) {
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<nums.length;i++){
//            min=Math.min(min,nums[i]);
//        }
//        return min;
//    }
}
