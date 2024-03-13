public class SumOfNNumbers {

    public static void main(String args[]){
        int n=5;
        int answer=sumOfNNumbers(n);
        System.out.println(answer);
    }

    //parameterized approach
    /*
    Time - O(n)
    Space - O(n)
     */
    private static int sumOfNNumbers(int n) {
        if(n==1)
            return 1;
        return n+ sumOfNNumbers(n-1);
    }
}
