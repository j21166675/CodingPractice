package Recursive;
import java.util.List;
import java.util.ArrayList;

public class LetterCaseVariations {

    private ArrayList<String> getResults(String input, String slate, ArrayList<String> results)throws Exception{
        if(input == null) throw new Exception(" String is null ");
        if(slate.length() == input.length()) {
            results.add(slate);
            return results;
        }
        int pos = slate.length();

        if(Character.isLetter(input.charAt(pos))){
            getResults(input, slate + Character.toUpperCase(input.charAt(pos)), results);
            getResults(input, slate + Character.toLowerCase(input.charAt(pos)), results);
        }
        else{
            getResults(input, slate + input.charAt(pos), results);
        }
        return results;



    }

    public static void main(String a[])throws Exception{
        LetterCaseVariations obj = new LetterCaseVariations();
        for(String s:obj.getResults("a12b","",new ArrayList<String>())){
            System.out.println(s);
        }
    }

}
