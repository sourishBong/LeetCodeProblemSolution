package Recusion.SchoolBasicEasy;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
    private static List<Integer> answer=new ArrayList<>();
    public static void main(String args[]){
        int n=16;
        List<Integer> result=printPattern(n);
        System.out.println(result);
    }

    private static List<Integer> printPattern(int N) {

        if(N<=0) {
            answer.add(N);
            return answer;
        }

     //   System.out.println(N);
        answer.add(N);
       printPattern(N-5);
      //  System.out.println(N);
        answer.add(N);
        return answer;
    }
}
