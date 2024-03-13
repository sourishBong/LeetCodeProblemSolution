package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String args[]){
        int n=3;
        List<String> answer=generateParenthesis(n);
        System.out.println(answer);
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        int open=1;
        int close=0;
        String current="(";
        recursiveParenthesis(result,current,open,close,n);
        return result;
    }

    private static void recursiveParenthesis(List<String> result,String current, int open, int close, int n) {
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(open<n)
            recursiveParenthesis(result,current+"(",open+1,close,n);
        if(close<open)
            recursiveParenthesis(result,current+")",open,close+1,n);
    }
}
