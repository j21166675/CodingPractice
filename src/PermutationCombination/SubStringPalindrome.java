package PermutationCombination;
import java.util.ArrayList;

public class SubStringPalindrome {
    public ArrayList<String> findSubSet(String slate, String str, ArrayList<String> results) {

        if(slate.length() == str.length()){
            results.add(slate);
            System.out.println(slate);
        }

        for(int i=0; i<str.length(); i++) {
            findSubSet(slate + str.charAt(i+1), str, results);
        }
        return results;

    }

    public static void main(String a[]){
        SubStringPalindrome s = new SubStringPalindrome();
        s.findSubSet("", "Johney",new ArrayList<>());
    }
}
