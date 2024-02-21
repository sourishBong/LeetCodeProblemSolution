package medium;

public class SingleNumberII {

    public static void main(String args[]){
        int nums[]={2,2,3,2};
        int answer=singleNumber(nums);
        System.out.println(answer);
    }

    private static int singleNumber(int[] nums) {
       // int threeN=Integer.MAX_VALUE; // Integer.MAX_VALUE not working for negative values so taking -1;
        int threeN=-1;
        int threeNplusOne=0;
        int threeNplusTwo=0;
        for(int i=0;i<nums.length;i++){

            //finding common bits
            int commonInThreeN=nums[i] & threeN;
            int commonInThreeNplusOne=nums[i] & threeNplusOne;
            int commonInThreeNplusTwo=nums[i] & threeNplusTwo;

            //replacing the setbits and moving to those set bits to next catagory
            // 3n -> 3n+1
            //3n +1 -> 3n+2
            // 3n +2 -> 3n
            threeN=threeN & (~commonInThreeN);
            threeNplusOne=threeNplusOne | commonInThreeN;

            threeNplusOne=threeNplusOne & (~commonInThreeNplusOne);
            threeNplusTwo=threeNplusTwo | commonInThreeNplusOne;

            threeNplusTwo=threeNplusTwo & (~commonInThreeNplusTwo);
            threeN=threeN | commonInThreeNplusTwo;

        }
        return threeNplusOne;
    }
}
