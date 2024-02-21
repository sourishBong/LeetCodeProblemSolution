package easy;

import java.math.BigInteger;

public class CounttheDigitsThatDivideaNumber {

    public static void main(String args[]){
        int num=121;
        int count=countDigits(num);
        System.out.println(count);
    }

    private static int countDigits(int num) {
        int temp=num;
        int count=0;
        while(temp!=0){
          int n=temp%10;
          if(num%n==0)
              count++;
            temp=temp/10;
        }
        return count;

    }
}
