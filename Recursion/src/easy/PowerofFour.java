package easy;

public class PowerofFour {

    public static void main(String args[]){
        int n=16;
        int n2=6;
        int n3=18;
        boolean answer=isPowerOfFour(n2);
       // boolean answer2=isPowerOfFourUsingLoop(n);
        System.out.println(answer);
    }

    //optimized recursion
    private static boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0) // If n is not divisible by 4, it's not a power of four
            return false;
        return isPowerOfFour(n / 4); // Recursively check if n / 4 is a power of four
    }

    //using recursion
    private static boolean isPowerOfFourNotOptimized(int n) {
        if(n==1)
            return true;

       if(n%4==1 || n==0 || n==5 || n==6 || n==7)
            return false;
        if(n%4==0)
        return isPowerOfFour( n/4);
        return false;
    }

    //using loop
    private static boolean isPowerOfFourUsingLoop(int n){
        while(n%4==0){
            n=n/4;
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
