
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
    private boolean isPresentNonDuplicates(int[] arr, int target) {
        Map<Integer, Integer> map = getMap(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int exp = target - (arr[i] + arr[j]);
            if (map.containsKey(exp) && map.get(exp) != i) {
                return true;
            }
            j++;
        }
        return false;
    }

    private Map<Integer, Integer> getMap(int[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        return map;
    }

    public static void main(String a[]){
        ThreeSum obj = new ThreeSum();
        System.out.println(obj.isPresentNonDuplicates(new int[]{-2,4,6,8,9}, 14));

        }
    }
