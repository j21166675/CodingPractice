/*
String Palindrome ignoring space
 */

public class StringPalindrome {

    public boolean isPalindrome(String s) {

        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) == ' ' ){
                i++;
            }
            if(s.charAt(j) == ' '){
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        i++;
            j--;
        }
        return true;
    }

    public static void main(String a[]){
        StringPalindrome str = new StringPalindrome();
        System.out.println(str.isPalindrome("malayalam"));
        System.out.println(str.isPalindrome(" a man a plan a canal panama"));
    }
}
