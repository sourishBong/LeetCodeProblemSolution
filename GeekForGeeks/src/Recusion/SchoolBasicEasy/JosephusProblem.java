package Recusion.SchoolBasicEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JosephusProblem {

    public static void main(String args[]){
        int n=5;
        int k=3;
        int answer=josephus(n,k);
        System.out.println(answer);
    }

    //Using recursion
    public static int josephus(int n, int k)
    {
      if(n==1)
          return 1;
      return (josephus(n-1,k)+k-1)%n+1;
    }
}
