package easyProblems;

public class ReversePrefixofWord {

    public static void main(String args[]){
        String word="rzwuktxcjfpamlonbgyieqdvhs";
        char ch='s';
        String answer=reversePrefix(word,ch);
        System.out.println(answer);
    }

    private static String reversePrefix(String word, char ch) {
        char chArray[]=word.toCharArray();
        int i=0;
        int j=chArray.length;
        for(int k=0;k<chArray.length;k++) {
            if(ch==chArray[k]) {
                j=k;
                break;
            }
        }
        if(j==chArray.length)
            return word;
        while(i<=j){
                char temp=chArray[i];
                chArray[i]=chArray[j];
                chArray[j]=temp;
                i++;
                j--;
            }
       return new String(chArray);
    }
}
