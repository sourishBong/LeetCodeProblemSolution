package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberofEvenandOddBits {

    public static void main(String args[]){
        int n=2;
        int answer[]=evenOddBit(n);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] evenOddBit(int n) {
        List<Integer> decimal=new ArrayList<>();
        int even=0;
        int odd=0;
        int arr[]=new int[2];
        while(n>0){
            decimal.add(n%2);
            n=n/2;
        }

           for(int i=0;i<decimal.size();i++) {
               if (decimal.get(i) == 1) {
                   if (i % 2 == 0)
                       even++;
                   else
                       odd++;
               }
           }
        arr[0]=even;
        arr[1]=odd;
        return arr;
    }
}
