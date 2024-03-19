package medium;

public class SingleElementinaSortedArray {

    public static void main(String args[]){
        int nums[]={1,1,2,3,3,4,4,8,8};
        int answer=singleNonDuplicate(nums);
        System.out.println(answer);
    }

    private static int singleNonDuplicate(int[] nums) {
        int ans=-1;
        int n=nums.length;

        if(n==1)
            return nums[0];
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[n-1]!=nums[n-2])
            return nums[n-1];

        int low=1;
        int high=nums.length-2;

        //Left Half -even,odd
        //right half-odd,even
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) {
                ans = nums[mid];
                break;
            }

            if(mid%2==0){
                if(nums[mid]==nums[mid+1])
                    low=mid+1;
                else
                    high=mid-1;
            }else{
                if(nums[mid]==nums[mid+1])
                    high=mid-1;
                else
                    low=mid+1;
            }
        }
        return ans;
    }
}
