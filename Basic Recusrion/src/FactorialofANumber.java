public class FactorialofANumber {

    public static void main(String args[]){
        int x=5;
        int answer=factorial(x);
        System.out.println(answer);
    }

    /*
    Parameterized Recursive approach
     */
    private static int factorial(int x) {
        if(x==1)
            return 1;
        return x * factorial(x-1);
    }
}
