package easyProblems;

public class LexicographicallySmallestPalindrome {

    public static void main(String args[]){
        String s="egcfe";
        String s2="seven";
        String answer=makeSmallestPalindrome(s2);
        System.out.println(answer);
    }

    private static String makeSmallestPalindrome(String s) {
        char[] word=s.toCharArray();
        int i=0;
        int j=word.length-1;
        while(i<=j){
           if(word[j]>word[i]){
                word[j]=word[i];
            }else{
                word[i]=word[j];
            }
            i++;
            j--;
        }

        return new String(word);
    }
}
