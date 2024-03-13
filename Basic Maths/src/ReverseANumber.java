public class ReverseANumber {

    public static void main(String args[]){
        int n=123;
        int rev=reverseNum(n);
        System.out.println(rev);
    }
    /*
    Reverse Using StringBuilder
    Time-0(1)
    Space-O(1)
     */
    private static int reverseNum(int n) {
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        String s=String.valueOf(sb.reverse());
        int rev=Integer.parseInt(s);
        return rev;
    }

    /*
    Time complexity- O(n)
    Space- O(1)
    Returning 0 if number is outside range of Integer value
     */
    private static int reverseNumApproach1(int x) {
        long rev=0;
        while(x!=0){
            rev=rev*10 + x%10;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            return 0;

        return (int) rev;
    }
}
