package platform;

import java.math.BigInteger;

public class ReverseBits {

    public static void main(String args[]){
        String s="00000010100101000001111010011100";
        int n=43261596;
        int answer=solve(n);
        System.out.println(answer);
        solve2(s);
    }

    private static void solve2(String s) {
        long res = 0;

        for (int i = 31; i >= 0; i--) {
            res = res<< 1;
            int j=(s.charAt(i) - '0') % 2;
            res =res+ j;
        }

        //return res;

        //return num;
        System.out.println(res);
    }

    private static int solve(int n) {
        int res = 0;
        int shift = 31;
        while (n != 0) {
            res ^= (n & 1) << shift;
            shift--;
            n >>>= 1;
        }
        return res;
    }
}
