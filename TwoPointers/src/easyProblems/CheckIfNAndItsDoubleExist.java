package easyProblems;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {

    public static void main(String args[]){
        int arr[]={10,2,5,3};
        int arr2[]={3,1,7,11};
        int arr3[]={7,1,14,11};
        int arr4[]={-20,8,-6,-14,0,-19,14,4};
        int arr5[]={2,3,3,0,0};
        int arr6[]={-2,0,10,-19,4,6,-8};
        boolean answer=checkIfExist(arr2);
        System.out.println(answer);
    }

    private static boolean checkIfExist(int[] arr) {
        Map<Double,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey((double)arr[i]*2) || map.containsKey((double)arr[i]/2)){
               map.put((double) arr[i],map.get(arr[i]+1));
                return true;
            }else{
                map.put((double) arr[i],1);
            }
        }
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(0) && map.containsValue(1))
//                continue;
//            if(map.containsKey(2*arr[i])){
//                return true;
//            }
//        }
        return false;
    }

    //twoPointer approach (Not able to solve)
    private static boolean checkIfExistTwoPointer(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==0 || arr[j]==0){
                return true;
            }else if(arr[i]==(2*arr[j]) || arr[j]==(2*arr[i]))
                return true;
            else if(arr[i]>arr[j]){
                j--;
            }else if(arr[i]<arr[j] && arr[i]>arr[i+1]) {
                j--;
            }else if(arr[i]<arr[j]){
               i++;
            } else{
                i++;
            }
        }
        return false;
    }
}
