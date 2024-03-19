package medium;

public class SearchinRotatedSortedArrayII {

    public static void main(String args[]){
        int nums[]={2,5,6,0,0,1,2};
        int target=0;
        boolean answer=search(nums,target);
        System.out.println(answer);
    }

    //simpler solution
    private static boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]) return true;

            //edge case
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            //if left is sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }else{
                if(nums[mid]<target && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return false;
    }

    //not a simple solution
    private static boolean searchNotSimple(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid])
              return true;

            if(nums[low]<nums[mid] || nums[mid]>nums[high]){
                if(nums[low]<=target && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }else if(nums[high]>nums[mid] || nums[mid]<nums[low]){
                if(nums[mid]<target && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }else{
                high--;
            }
        }
        return false;
    }
}
