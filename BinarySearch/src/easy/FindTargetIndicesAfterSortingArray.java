package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    public static void main(String args[]) {
        int nums[] = {1, 2, 5, 2, 3};
        int target = 2;
        List<Integer> answer = targetIndices(nums, target);
        System.out.println(answer);
    }

    //using linear search approach
    private static List<Integer> targetIndicesLinear(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr.add(i);
            }
        }
        return arr;
    }


    private static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> out=new ArrayList<>();

        int low=0;
        int high=nums.length-1;
        int ansl=-1;
        while(low<=high)

        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                ansl=mid;
                high=mid-1;
            }else if(nums[mid]>target)
            {
                high=mid-1;
            }else{
                low=mid+1;
            }

        }

        low=0;
        high=nums.length-1;
        int ansr=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                ansr=mid;
                low=mid+1;
            }else if(nums[mid]>target)
            {
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        if(ansl==-1)
        {
            return out;
        }
        for(int i=ansl;i<=ansr;i++)
        {
            out.add(i);
        }
        return out;
    }
}
