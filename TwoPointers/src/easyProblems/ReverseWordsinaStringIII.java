package easyProblems;

public class ReverseWordsinaStringIII {

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String answer=reverseWords(s);
        System.out.println(answer);
    }

    public static String reverseWordsNsquare(String s) {
        String[] answer=s.split(" ");
        String newResult = "";
        for(String a:answer) {
            char[] result=a.toCharArray();
            int i=0;
            int j=result.length-1;
            while(i<j) {
                char temp=result[i];
                result[i]=result[j];
                result[j]=temp;
                i++;
                j--;
            }
            newResult=newResult+new String(result)+" ";

        }
        return newResult.trim();

    }

    public static String reverseWordsTry(String s) {
        char[] a=s.toCharArray();
        String result = "";
        int i=0;
        int k=0;
        int j=a.length-1;
        while(i<j) {
            if(a[k]!=' ') {
                k++;
            }else {
                char temp=a[i];
                a[i]=a[k-1];
                a[k-1]=temp;
                i++;
                k--;
            }

            //j--;
        }
        result=new String(a);
        return result;

    }

    public static String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        String[] words=s.split(" ");
        for(String word:words) {
            StringBuilder sb=new StringBuilder();
            sb.append(word);
            sb.reverse();
            result.append(sb);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
