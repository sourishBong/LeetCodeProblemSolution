package easy;

public class PowerofTwo {

    public static void main(String args[]){
        int n=16;
        boolean answer=isPowerOfTwo(n);
        System.out.println(answer);
    }

    //using recursion
    private static boolean isPowerOfTwo(int n) {
        if(n==1 || n==2)
            return true;
        if(n%2==1 ||n ==0)
            return false;

        return (isPowerOfTwo(n/2));


    }
}
