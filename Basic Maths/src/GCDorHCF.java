public class GCDorHCF {

    public static void main(String args[]){
        int num1=52;
        int num2=10;
        int answer=gcd(num1,num2);
        System.out.println(answer);
    }

    /*
    Euclidean Algorithm
    It states that if we are trying to find gcd of n1,n2 then
    gcd(n1,n2) is equivalent to gcd(n1-n2,n2) where n1> n2

    Better Euclidean is as follows
    gcd(n1,n2) === gcd(n1%n2,n2) where n1> n2

    Time- O(log(min(m,n))
     */
    private static int gcd(int num1, int num2) {
        while(num1>0 && num2>0){
            if(num1>num2){
                num1=num1%num2;
            }else{
                num2=num2%num1;
            }
        }
        if(num1==0)
            return num2;
        else
            return num1;
    }

    /*
    Brute Force
    Time - O(n)
    Running the loop from min of num1 & num2
    this will always return the Highest Common FActor if divisible
     */
    private static int gcdApproach2(int num1, int num2) {
        int gcd=1;
        for(int i=Math.min(num1,num2);i>=2;i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        return gcd;
    }


    /*
    Approach 1-
    Brute Force
    Time - O(n)
    Taking Math.Max to figure out Greatest Common Divisor
     */
    private static int gcdApproach1(int num1, int num2) {
        int min=Math.min(num1,num2);
        int gcd=0;
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                gcd= Math.max(gcd,i);
            }
        }
        return gcd;
    }
}
