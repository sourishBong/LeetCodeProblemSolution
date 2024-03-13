public class CountDigitsInNumber {

    public static void main(String args[]){
        int n=8394;
        int answer=countDigit(n);
        System.out.println(answer);
    }
    /*
    Using Log base 10 beacuse
    The number of digits in an integer = the upper bound of log10(n).
    Time - O(1)
    Space - O(1)
     */
    private static int countDigit(int n) {
        System.out.println(Math.log10(n));
        int a= (int) Math.log10(n)+1;
        int digits= (int) Math.floor(a);
        return digits;
    }

    /*
    Using string length() method to calculate length
    Time- O(1)
    Space- O(1)
     */
    private static int countDigitUsingString(int n) {
        String s=String.valueOf(n);
        return s.length();
    }

    /*
    Time complexity: O(n)
    Space complexity: O(1)
     */
    private static int countDigitUsingNormalMethod(int n) {
        int count=0;
        while(n!=0){
           n=n/10;
           count++;
        }
        return count;
    }
}
