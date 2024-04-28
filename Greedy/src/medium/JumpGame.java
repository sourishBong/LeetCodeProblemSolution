package medium;

public class JumpGame {

    public static void main(String args[]){
        int nums[]={3,2,1,0,4};
        //int nums[]={2,3,1,1,4};
        boolean answer=canJumpII(nums);
        System.out.println(answer);
    }

    //appraoch 2
    private static boolean canJumpII(int[] nums){
        int reachable =0;
        for(int i=0;i<nums.length;i++){
            if(i>reachable)
                return false;

            if(nums[i]+i>reachable)
              reachable=nums[i]+i;
        }
        if(reachable>=nums.length-1)
            return true;
        return false;
    }

    //approch 1
    private static boolean canJump(int[] nums) {
        int index=nums.length-1;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=index){
                index=i;
            }
        }
        if(index==0)
            return true;
        return false;
    }
}
