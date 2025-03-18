package Sorting;

import java.util.ArrayList;

public class SubstringPalindrome {
    public void substring(String str, int i, ArrayList<String> slate) {
        if (i == str.length()) {
            System.out.println(slate.toString());
        }
        for (int j = i; j < str.length(); ++j) {
            if (isPalindrome(str, i, j)) {
                slate.add(str.substring(i, j+1));
                substring(str, j + 1, slate);
                slate.remove(slate.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str, int i, int j) {

        while(i<=j) {
             // System.out.println("i: " + str.charAt(i) + " j: " + str.charAt(j));
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
        }
    public static void main(String str[]){
        SubstringPalindrome obj = new SubstringPalindrome();
        obj.substring("abaaba", 0, new ArrayList<String>());
    }
}
