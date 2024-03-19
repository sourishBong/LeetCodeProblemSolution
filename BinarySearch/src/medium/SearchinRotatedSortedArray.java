package medium;

public class SearchinRotatedSortedArray {

    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        int answer=search(nums,target);
        System.out.println(answer);

    }

    //binary search
    private static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid])
                return mid;

            //if nums[low] <= nums[mid] then low part is sorted
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
        return -1;
    }
}
