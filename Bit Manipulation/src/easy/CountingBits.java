package easy;

import java.util.Arrays;

public class CountingBits {

    public static void main(String args[]){
        int n=5;
        int[] answer=countBits(n);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] countBits(int n) {
        int arr[]=new int[n+1];
        int j=0;
        for(int i=0;i<=n;i++){
            int num=i;
            int sum=0;
            while(num!=0) {
                num=num&(num-1);
                sum++;
            }
            arr[j]=sum;
            j++;
        }
        return arr;
    }

    private static int[] countBitsOld(int n) {
        int arr[]=new int[n+1];
        int j=0;
        for(int i=0;i<=n;i++){
            int num=i;
            int sum=0;
            while(num!=0) {
                sum = sum+num % 2;
                num = num / 2;
            }
            arr[j]=sum;
            j++;
        }
        return arr;
    }
}
