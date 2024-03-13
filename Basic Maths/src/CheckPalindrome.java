public class CheckPalindrome {

    public static void main(String args[]){
        int n=121;
        boolean answer=checkPalindrome(n);
        System.out.println(answer);
    }

    /*
    Time- O(n)
    Space- O(1)
     */
    private static boolean checkPalindrome(int n) {
        int rev=0;
        int temp=n;
        while(temp!=0){
            rev=rev*10 + temp%10;
            temp=temp/10;
        }
        if(rev==n)
            return true;
        else
            return false;
    }
}
