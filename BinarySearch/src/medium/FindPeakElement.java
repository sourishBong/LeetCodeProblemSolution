package medium;

public class FindPeakElement {

    public static void main(String args[]){
        int nums[]={1,2,3,1};
        int answer=findPeakElement(nums);
        System.out.println(answer);
    }

    private static int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        int ans=0;

        //eliminated the first and last element
        int low=1;
        int high=nums.length-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) {
                ans = mid;
                break;
            }
            else if(nums[mid]>nums[mid-1])
                low=mid+1;
            else
                high=mid-1;
        }

        return ans;
    }
}
