package easy;

public class XOROperationinanArray {

    public static void main(String args[]){
        int n=5;
        int  start=0;
        int answer=xorOperation(n,start);
    }

    private static int xorOperation(int n, int start) {
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
            sum=sum^nums[i];
        return sum;
    }
}
