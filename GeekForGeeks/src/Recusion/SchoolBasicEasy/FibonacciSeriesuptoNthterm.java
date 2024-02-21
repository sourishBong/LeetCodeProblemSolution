package Recusion.SchoolBasicEasy;

import java.util.Arrays;

public class FibonacciSeriesuptoNthterm {
    private static long[] arr;
    public static void main(String args[]){
        int N=5;
        arr=new long[N];
        long answer[]=Series(N);
        System.out.println(Arrays.toString(answer));
    }

    private static long[] Series(int N) {
        if(N==0)
            arr[N]=N;
        if(N==1)
            arr[N]=N;

      return Series((N-2)+(N-1));

    }
}
