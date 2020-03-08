import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidParanthesis {
    public static void main(String[] s) throws Exception {
        ValidParanthesis obj = new ValidParanthesis();
        System.out.println(obj.isValidExp("()()()(){}{}{}[][][]"));

        System.out.println(obj.longestValidParentheses("()(()"));
    }

    public int longestValidParentheses(String s) {
        if(s == null) return 0;
        if(s.length() == 0) return 0;
        ArrayList<Character> list = new ArrayList<Character>();
        int i=0;
        int count =0;
        for(char ch:s.toCharArray()){
            if(i>0){

                if( ch == ')' && list.get(i-1) == '('){
                    count += 2;
                    list.remove(i-1);
                    i--;
                }
                else {
                    list.add(ch);
                    i++;
                }
            }

            else {
                list.add(ch);
                i++;
            }
        }
        return count;
    }

    private boolean isValid(String str) throws Exception {
        if (str == null) throw new Exception(" String is Null");
        if (str.length() == 0) return true;
        ArrayList<Character> list = new ArrayList<Character>();
        int i = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == ')') {
                if (i == 0 && ch == ')') return false;
                else if (i == 0 && ch == '(') {
                    list.add(ch);
                    i++;
                } else if (ch == '(') {
                    list.add(ch);
                    i++;
                } else {
                    if (list.get(i - 1) == '(') {
                        list.remove(i - 1);
                        i--;
                    }
                }

            }
        }
        return list.size() <= 0;
    }

    private boolean isValidExp(String s) throws Exception {
        if (s == null) throw new Exception(" String is null ");
        if (s.length() == 0) return true;
        ArrayList<Character> list = new ArrayList<Character>();
        Map<Character, Character> map = retMap();
        int i = 0;
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (i == 0 && map.containsKey(ch)) return false;
            else if (map.containsKey(ch) && list.get(i - 1) != map.get(ch)) {
                return false;
            } else if (map.containsKey(ch) && list.get(i - 1) == map.get(ch)) {
                list.remove(i - 1);
                i--;
                count += 2;
            } else {
                list.add(ch);
                i++;
            }
        }
        return list.size() <= 0;
    }

    private Map<Character, Character> retMap() {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');


        return map;
    }
}
