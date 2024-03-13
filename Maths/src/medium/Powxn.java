package medium;

public class Powxn {

    public static void main(String args[]){
        double x=2.00000;
        int n=-2;
        double answer=myPow(x,n);
        System.out.println(answer);
    }

    /*
    Time Complexity: O(log n)
    Space Complexity: O(1)
     */
    private static double myPow(double x, int n) {
        double result=1.0;
        long num=n;
        if(n<0)
            num=-1 * num;
        while(num!=0){
            if(num%2==1){
                result=result*x;
                num=num-1;
            }else{
                x=x*x;
                num=num/2;
            }
        }
        if(n<0)
           result= (double)1.0/result;
        return result;
    }
}
