package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String args[]){
        int numRows=5;
        List<List<Integer>> answer=generate(numRows);
        System.out.println(answer);
    }

    //need optimization
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();

        if(numRows==0) return result;

        List<Integer> list=new ArrayList<>();
        list.add(1);
        result.add(list);

        if(numRows==1) return result;

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=result.get(i-1);

            //Start new Row
            List<Integer> currRow=new ArrayList<>();
            currRow.add(1);
            for(int j=0;j<i-1;j++){
                currRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            currRow.add(1);
            result.add(currRow);
        }
        return result;
    }
}
