package HomeWork1;

import java.util.Arrays;

public class FindSecondMax {

    public static void main(String args[]){
        int[] array={21,34,67,12,98,44};
        int answer=secondMax(array);
        System.out.println(answer);
    }

    //Optimized Solution
    private static int secondMax(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
            for(int num:arr){
                if(num>max){
                    secondMax=max;
                    max=num;
                }else if(num>secondMax){
                    secondMax=num;
                }
            }
            return secondMax;
    }

    //Using Brute Force Approach
    private static int secondMaxBruteForce(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j]<array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i]=temp;
                }
            }
        }
       // System.out.println(Arrays.toString(array));
        return array[1];
    };

    //Using Arrays.sort function
    private static int secondMaxSort(int[] array) {
        Arrays.sort(array);
       return array[array.length-2];
    }



}
