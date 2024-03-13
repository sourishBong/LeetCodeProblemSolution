package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Findthelengthoflargestsubarraywith0sum {

    public static void main(String args[]){
        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        int answer=maxLen(arr);
        System.out.println(answer);
    }

    private static int maxLen(int[] arr) {
        int sum=0;
        int maxCount=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0)
                maxCount=i+1;
            if(map.containsKey(sum))
               maxCount=Math.max(maxCount,i-map.get(sum));
            else
                map.put(sum,i);
        }
        return maxCount;
    }
}
