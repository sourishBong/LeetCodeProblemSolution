package easyProblems;

public class FaultyKeyboard {

    public static void main(String args[]){
        String s="string";
        String answer=finalString(s);
        System.out.println(answer);
    }

    public static String finalString(String s) {
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int j=0;
        int n=ch.length-1;
        while(j<=n){
           if(ch[j]!='i'){
               sb.append(ch[j]);
               j++;
           }else{
               sb.reverse();
               j++;
           }
        }
        return sb.toString();
    }


}
