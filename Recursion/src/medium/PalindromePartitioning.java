package medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String args[]){
        String s="aab";
        List<List<String>> answer=partition(s);
        System.out.println(answer);
    }

    private static List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        recursivePartition(s,result,list,0);
        return result;
    }

    private static void recursivePartition(String s, List<List<String>> result, List<String> list, int index) {
        if(index==s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(i,index,s)){
                list.add(s.substring(index,i+1));
                recursivePartition(s,result,list,i+1);
                list.remove(list.size()-1);
            }

        }
    }

    private static boolean isPalindrome(int end, int start, String s) {
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
