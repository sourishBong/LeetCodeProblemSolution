package medium;

public class Powxn {
    public static void main(String args[]){
        double x=2.00000;
        int n=-2147483648;
        double answer=myPow(x,n);
        System.out.println(answer);
    }
    /*
    Time-> O(logn)
     */
    private static double myPowBitwise(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        double pow = 1;

        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }

            x *= x;
            n >>>= 1;

        }

        return pow;
    }
    private static double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
//         double result=myPow(x,n/2);
//        if(n%2==0){
//                result=result*result;
//        }else{
//                result=x*result*result;
//        }
//        return result;
        return powHelper(x,n);
    }

    private static double powHelper(double x, int n) {
        if(n==0)
            return 1;
        double result=powHelper(x,n/2);
        if(n%2==0){
            result=result*result;
        }else{
            result=x*result*result;
        }
        return result;
    }
}
