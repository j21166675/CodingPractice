import java.util.HashMap;
import java.util.Map;

public class Parentheses {
    public static void main(String[] a) {
        Parentheses obj = new Parentheses();
        System.out.println(obj.isValid("()[]{}"));
    }

    public boolean isValid(String s) {
        Map<Character, Character> map = setMap();
        boolean res = false;
        if (s.length() % 2 != 0) return res;
        if (s == null) return res;
        int i = (s.length() / 2) - 1;
        int j = i + 1;
        System.out.println(" s.charAt(j) : " + s.charAt(j));
        System.out.println(" s.charAt(i) : " + map.get(s.charAt(i)));
        while (i >= 0 && map.get(s.charAt(i)) == s.charAt(j)) {
            System.out.println(" i : " + i);
            i--;
            j++;
        }
        System.out.println(" i : " + i);
        res = i < 0;

        return res;
    }

    private Map<Character, Character> setMap() {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        return map;
    }
}
