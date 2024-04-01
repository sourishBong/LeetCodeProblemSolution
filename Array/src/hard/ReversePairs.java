package hard;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {

    public static void main(String args[]){
       // int nums[]={1,3,2,3,1};
        int nums[]={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int answer=reversePairs(nums);
        System.out.println(answer);
    }

    private static int reversePairs(int[] nums) {

        int low=0;
        int high=nums.length-1;
        return mergeSort(nums,low,high);
    }

    private static int mergeSort(int[] nums, int low, int high) {
        int count=0;
        if(low>=high)
            return count;
        int mid=(low+high)/2;
        count=count+mergeSort(nums,low,mid);
        count=count+mergeSort(nums,mid+1,high);
        count=count+countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }

    private static int countPairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && nums[i] > 2 * (long)nums[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    private static void merge(int[] nums, int low, int mid, int high) {

        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
}
