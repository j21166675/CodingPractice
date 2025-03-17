package Recursive;
import java.util.ArrayList;

public class SubStringPalindrome {
    public ArrayList<String> findSubSet(String slate, String str, ArrayList<String> results) {

        if(slate.length() == str.length()){
            results.add(slate);
            System.out.println(slate);
        }

        int pos = slate.length();
        return findSubSet(slate+str.charAt(pos), str, results);

    }

    public static void main(String a[]){
        SubStringPalindrome s = new SubStringPalindrome();
        s.findSubSet("", "Johney",new ArrayList<>());
    }
}
