package easy;

public class SearchInsertPosition {

    public static void main(String args[]){
        int nums[]={1,3,5,6};
        int target=4;
        int answer=searchInsert(nums,target);
        System.out.println(answer);
    }

    private static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }

    //More optimized needed
    private static int searchInsertNotOptimized(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<nums[mid]){
                ans=mid;
                high=mid-1;
            }else if(target>nums[mid]){
                low=mid+1;
            }else{
                ans=mid;
                return ans;
            }
        }
        return ans;
    }
}
