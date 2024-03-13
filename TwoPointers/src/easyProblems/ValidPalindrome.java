package easyProblems;

public class ValidPalindrome {

    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        boolean answer=isPalindrome(s);
        System.out.println(answer);
    }

    /*
    Optimized approach
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    private static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    /*
    Using StringBuilder reverse
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    private static boolean isPalindromeUsingStringBuilder(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","");
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String rev=sb.reverse().toString();
        if(s.equals(rev))
            return true;
        else
            return false;
    }

    /*
    Using two pointer
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    private static boolean isPalindromeTwoPointer(String s) {
        //time complexity -> O(n)
        s=s.replaceAll("[^A-Za-z0-9]","");
        //time complexity -> O(n)
        s=s.toLowerCase();
        //space complexity -> O(n)
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        //time complexity -> O(n)
        while(i<j){
            if(ch[i]!=ch[j])
                return false;
            i++;
            j--;
        }

        return true;
    }
}
