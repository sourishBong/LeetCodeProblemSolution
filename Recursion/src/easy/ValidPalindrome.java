package easy;

public class ValidPalindrome {

    public static void main(String args[]){
        String s="A man, a tlan, a canal: Panama";
        boolean answer=isPalindrome(s);
        System.out.println(answer);
    }

    private static boolean isPalindrome(String s) {
       // s=s.replaceAll("[^A-Za-z0-9]","");
      //  s=s.toLowerCase();
    // return  checkPalindrome(s,0);
        return checkPalindrome2(s,0,s.length()-1);
    }
    /*
    Approach 2 using recursion
     */
    private static boolean checkPalindrome2(String s, int i, int j) {
        if(i<j){
           char left=s.charAt(i);
           char right=s.charAt(j);
           if(!Character.isLetterOrDigit(Character.toLowerCase(left)))
               return checkPalindrome2(s,i+1,j);
           else if(!Character.isLetterOrDigit(Character.toLowerCase(right)))
               return checkPalindrome2(s,i,j-1);
           else if(Character.toLowerCase(left)!=Character.toLowerCase(right))
               return false;
           else
               return checkPalindrome2(s,i+1,j-1);
        }
        return true;
    }

    /*
    Approach 1 using recursion
    here we have to pass string after removing extra spaces , spl character and to lowercase
     */
    private static boolean checkPalindrome(String s, int i) {
        if(i>=s.length()/2)
            return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        return checkPalindrome(s,i+1);
    }
}
