package easy;

public class FibonacciNumber {

    public static void main(String args[]){
        int n=6;
        int answer=fib(n);
        System.out.println(answer);
    }
    public static int fib(int n) {
        if(n == 0 || n == 1) return n;

        return fib(n-1)+fib(n-2);
    }
}
