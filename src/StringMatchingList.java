import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringMatchingList {
    private boolean isStringMatch(String str, ArrayList<String> list){
        boolean[] table = new boolean[str.length() + 1];
        table[0] = true;
        for(int i = 1;i<=str.length();i++){
            for(int j = 0;j<i;j++){
                String sub = str.substring(j,i);
              //  System.out.println(sub);
                System.out.println("table[i] " +i+" "+ table[i]);
                System.out.println("table[j] " + j+" "+ table[j]);
                System.out.println("sub " + sub);
                if(table[j] && list.contains(sub)) {
                    System.out.println("Entry inside matching list");
                    table[i] = true;
                    System.out.println("table[i] after matching " +i+" "+ table[i]);

                    break;
                }
            }
            System.out.println("--------------");
        }
        return table[str.length()];
    }

    private boolean stringMatchRec(String str, ArrayList<String> list){
        //boolean res = false;
        int i = 0;
        int j = 0;
        boolean found = false;
        for( i=0;i<str.length();i++){
            for( j=i+1;j<=str.length();j++){
                String sub = str.substring(i,j);
                found = false;
                if(list.contains(sub)){
                    i=j-1;
                    found = true;
                    break;
                }
            }
            if(j > str.length() && !found){
                found = false;
                break;
            }
        }
        return found;
    }

    public static void main(String [] args){
        StringMatchingList sm = new StringMatchingList();
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("aaa");

        System.out.println(sm.stringMatchRec("aaaaaaa", list));

    }
}
