import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindingDuplicate {

    public static void main(String[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        FindingDuplicate obj = new FindingDuplicate();
        System.out.println(" Duplicate # " + obj.retDuplicate(list));

    }

    private int retDuplicate(ArrayList<Integer> list) {
        if (list == null) return 0;
        if (list.size() == 0) return 0;
        Map<Integer, Integer> map = retMap(list);

        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() > 1) return (int) entry.getKey();
        }
        return -1;
    }

    private Map<Integer, Integer> retMap(ArrayList<Integer> list) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(i) + 1);
            } else {
                map.put(list.get(i), 1);
            }
        }
        return map;
    }
}
