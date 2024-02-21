package platform;

public class SingleNumber {

    public static void main(String args[]){
        int nums[]={2,2,1};
        int num=find(nums);
        System.out.println(num);
    }

    private static int find(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum=sum^num;
        }
        return sum;
    }
}
