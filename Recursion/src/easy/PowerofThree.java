package easy;

public class PowerofThree {

    public static void main(String args[]){
        int n=27;
        boolean answer=isPowerOfThree(n);
        System.out.println(answer);
    }

    //using recursion
    private static boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n%2==0 || n<=0)
            return false;
        if(n%3==0)
        return isPowerOfThree(n/3);
        return false;
    }
}
