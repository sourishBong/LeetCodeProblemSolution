public class FactorialUsingRecursion {

    public static void main(String args[]){
        int n=5;
        int answer=fact(n);
        System.out.println(answer);
    }

    private static int fact(int n) {
        if (n==0) return 1;

        return n*fact(n-1);

    }
}
