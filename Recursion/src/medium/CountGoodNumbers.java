package medium;

public class CountGoodNumbers {
    private static long MOD=1000000007;
    public static void main(String args[]){
        long n=4;
        int answer=countGoodNumbers(n);
        System.out.println(answer);
    }

    /*
    there can be atmost 5 even elements(0,2,4,6,8);
    there can be atmost 4 prime elements(2,3,5,7)
    Time-O(logn)
     */
    private static int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long first=pow(5,even)%MOD;
        long second=pow(4,odd)%MOD;
        return (int) ((first*second)%MOD);
    }

    /*
    x is the base
    n is the power
     */
    private static long pow(long x,long n){
        if(n==0)
            return 1;
        long result=pow(x,n/2);
        if(n%2==0){
            return (result*result)%MOD;
        }else{
            return(x*result*result)%MOD;
        }
    }
}
