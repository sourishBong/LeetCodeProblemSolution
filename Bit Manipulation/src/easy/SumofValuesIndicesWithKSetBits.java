package easy;

import java.util.ArrayList;
import java.util.List;

public class SumofValuesIndicesWithKSetBits {

    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(2);
        int k=1;
        int answer=sumIndicesWithKSetBits(list,k);
        System.out.println(answer);
    }

    private static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k)
                result=result+nums.get(i);
        }
        return result;
    }

}
