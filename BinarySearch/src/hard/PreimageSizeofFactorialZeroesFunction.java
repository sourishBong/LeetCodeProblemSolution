package hard;

public class PreimageSizeofFactorialZeroesFunction {

    public static void main(String args[]){
        int k=5;
        int answer=preimageSizeFZF(k);
        System.out.println(answer);
    }

    public static int preimageSizeFZF(int k) {

        long low = 0;
      //  long high = (long)Math.pow(10,10);
        long high=Long.MAX_VALUE;

        while(low<=high){
            long mid  = low + (high-low)/2;
            long val = mid;
            long ans = 0;
            while(val!=0){
                val=val/5; //val/=5;
                ans=ans+val; //ans+=val;
            }
            if(ans==k){
                return 5;
            }else if(ans>k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return 0;
    }

    private static int preimageSizeFZFAnotherApproach(int k) {
        long left=0;
        long right=Long.MAX_VALUE;
        while(left<=right){
            long mid=(left+right)/2;
            long temp=helper(mid);
            if(temp==k)
                return 5;
            else if(temp<k)
                left=mid+1;
            else
                right=right-1;
        }
        return 0;
    }

    private static long helper(long mid) {
        long count=0;
        while(mid!=0){
            count=count+ (mid/5);
            mid=mid/5;
        }
        return count;
    }
}
