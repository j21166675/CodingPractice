import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] a) {
        FirstNonRepeatingChar obj = new FirstNonRepeatingChar();
        System.out.println(obj.firstUniqChar("cc"));
    }

    public int firstUniqChar(String s) {
        if (s == null) return -1;
        if (s.length() == 0) return -1;
        Boolean flag;
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, (map.get(ch)) + 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return i;
            else
                i++;
        }

        if (flag = true) i = -1;
        return i;
    }
}

