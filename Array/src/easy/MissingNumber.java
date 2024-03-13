package easy;

public class MissingNumber {

    public static void main(String args[]){
        int nums[]={3,0,1};
       // int answer=missingNumber(nums);
        int answer=missingNumberXor(nums);
        System.out.println(answer);
    }
    //with bit banipulation
    private static int missingNumberXor(int[] nums) {
        int n=nums.length;
        int xorTototal=0;
        for(int i=0;i<=n;i++){
            xorTototal=xorTototal^i;
        }
        for(int i=0;i<nums.length;i++){
            xorTototal=xorTototal^nums[i];
        }
        return xorTototal;
    }

    //With NUmber theory
    private static int missingNumber(int[] nums) {
        //sum of all numbers in array should be equal to (n*(n+1))/2 if they are in sequence
        int n=nums.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum=sum-nums[i];
        }
        return sum;
    }
}
