public class PrintFibonacci {

    public static void main(String args[]){
        int n=5;
        fibonacci(n);
    }

    private static void fibonacci(int n) {
        n=fib(n);
       // System.out.println(n);

    }

    private static int fib(int n) {
        if(n==0 || n==1)
            return n;
        System.out.println(n);
        return fib(n-1)+fib(n-2);
    }
}
