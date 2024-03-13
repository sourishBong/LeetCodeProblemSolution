public class FindNumberIsPrime {

    public static void main(String args[]){
        int n=9;
        boolean answer=prime(n);
        System.out.println(answer);
    }

    /*
    Optimal approach-> Run the loop till <= squre root of n
    Time complexity - O(squareRoot(n))
     */
    private static boolean prime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    /*
    Brute Force-Running the loop till n
     */
    private static boolean primeBrute(int n) {

        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
