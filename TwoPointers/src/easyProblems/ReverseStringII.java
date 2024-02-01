package easyProblems;

public class ReverseStringII {

    public static void main(String args[]){
        String s="abcdefg";
        int k=4;
        String answer=reverseStr(s,k);
        System.out.println(answer);
    }

    public static String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int i=0;
        int n=ch.length-1;
        while(i<=n){
           int j=Math.min(i+k-1,n);
           swap(ch,i,j);
           i=i+2*k;
           }
        return new String(ch);
    }

    public static void swap(char arr[],int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
