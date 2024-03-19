package easy;

public class MajorityElement {

    public static void main(String args[]){
        int nums[]={1,3,1,1,4,1,1,5,1,1,6,2,2};
        int answer=majorityElement(nums);
        System.out.println(answer);
    }

    //Moore's voting algorithm
    private static int majorityElement(int[] nums) {
        int element=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                element=nums[i];
            }else if(nums[i]==element)
                count++;
            else
                count--;
        }
//        count=0;
//        for(int i=0;i<nums.length;i++){
//
//        }
        return element;
    }
}
