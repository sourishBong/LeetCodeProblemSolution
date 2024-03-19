package easy;

public class FindPeakElement {

    public static void main(String args[]){
        int nums[]={1,2,3,1};
        int peak=peakElement(nums);
        System.out.println(peak);
    }

    private static int peakElement(int[] nums) {
        int peak=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>peak){
                peak=nums[i];
                index=i;
            }
        }
        return index;
    }
}
