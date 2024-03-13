package medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String args[]){
        int n=4;
        int k=2;
        List<List<Integer>> answer=combine(n,k);
        System.out.println(answer);
    }

    private static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        recursiveCombine(result,list,n,k,1);
        return result;
    }

    private static void recursiveCombine(List<List<Integer>> result, List<Integer> list, int n, int k, int index) {
        if (list.size()==k) {
            result.add(new ArrayList<>(list));
            return;
        }
      for(int i=index;i<=n;i++) {
            if (list.size() < k) {
                list.add(i);
            }
            recursiveCombine(result, list, n, k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
