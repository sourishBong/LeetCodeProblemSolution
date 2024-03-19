package medium;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {

    public static void main(String args[]){
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int answer[]=searchRange(nums,target);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    private static int findFirst(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    private static int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    //not optimized
    private static int[] searchRangeNotOptimized(int[] nums, int target) {
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        int low=0;
        int high=nums.length-1;

        //searching first occurance
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                ans[0]=mid;
                high=mid-1;
            }else if(target>nums[mid])
                low=mid+1;
            else
                high=mid-1;
                    }
        low=0;
        high=nums.length-1;

        //searching for Last position
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                    low=mid+1;
            }else if(target>nums[mid])
                low=mid+1;
            else
                high=high-1;
        }
        return ans;
    }
}
