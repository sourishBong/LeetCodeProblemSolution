package easy;

public class Sqrtx {

    public static void main(String args[]){
        int x=16;
        int answer=mySqrt(x);
        System.out.println(answer);
    }

    private static int mySqrt(int x) {
        int high=x;
        int low=1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid>x){
                high=mid-1;
            }else if(mid*mid<=x){
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}
