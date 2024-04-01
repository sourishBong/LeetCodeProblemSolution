package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String args[]){
        String s="abcabcbb";
        int answer=lengthOfLongestSubstring(s);
        System.out.println(answer);
    }

    private static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
         int left=0;
         int right=0;
         int maxLen=Integer.MIN_VALUE;

         while(right<s.length()){
             if(map.containsKey(s.charAt(right)))
                 left=Math.max(map.get(s.charAt(right))+1,left);

             map.put(s.charAt(right),right);

             maxLen=Math.max(maxLen,right-left+1);
             right++;
         }
         return maxLen;
    }
}
