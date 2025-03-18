package Sorting;

import java.util.Set;
import java.util.HashSet;

//abcabcbb

public class LengthLongestSubstring {
    public int findLength(String str) {
       int left = 0;
       int right = 0;
       int max = 0;
       Set<Character> set = new HashSet<>();
       while(left < str.length()){
           if(!set.contains(str.charAt(left))){
               set.add(str.charAt(left));
               left++;
               max = Math.max(max, set.size());
           }
           else{
               set.remove(str.charAt(right++));
           }
       }
       return max;
    }

    public static void main(String a[]){
        LengthLongestSubstring obj = new LengthLongestSubstring();
            System.out.println(obj.findLength("abcaahgfkl"));
    }
}
