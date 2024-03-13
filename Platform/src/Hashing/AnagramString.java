package Hashing;

import java.util.Arrays;

public class AnagramString {

    public static void main(String args[]){
        String str1="listen";
        String str2="silent";
        boolean answer=check(str1,str2);
        System.out.println(answer);
    }

    private static boolean check(String str1, String str2) {
        if(str1.length()!=str2.length())
            return false;
        str1= str1.toLowerCase();
        str2=str2.toLowerCase();
        int arr[]=new int[26];
        for(char c:str1.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:str2.toCharArray()){
            arr[c-'a']--;
            if(arr[c-'a']<0)
                return false;
        }
        return true;
    }


}
