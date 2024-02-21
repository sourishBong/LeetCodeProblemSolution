package easy;

public class Numberof1Bits {

    public static void main(String args[]){
        int n=00000000000000000000000000001011;
        int answer=hammingWeight(n);
    }

    private static int hammingWeight(int n) {
        int count=0;
        while(n!=0)
        {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
