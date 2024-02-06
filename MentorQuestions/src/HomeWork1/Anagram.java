package HomeWork1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String args[]){
        String s1="SILENL";
        String s2="LISTEN";
        boolean answer=anagram(s1,s2);
        System.out.println(answer);
    }

    private static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        Map<Character, Integer> stringMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (stringMap.containsKey(s1.charAt(i))) {
                stringMap.put(s1.charAt(i), stringMap.get(s1.charAt(i)) + 1);
            } else {
                stringMap.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (stringMap.containsKey(s2.charAt(i))) {
                stringMap.remove(s2.charAt(i));
            }

        }
        if(stringMap.size()==0)
            return true;
        return false;
    }

    //using Arrays.sort
    private static boolean anagramUisngSort(String s1, String s2) {
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        if(ch1.length!=ch2.length)
            return false;
        int count=0;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++) {
            if (ch1[i] == ch2[i])
                count++;
        }
        if(ch1.length==count)
            return true;
        else
            return false;
    }
}
