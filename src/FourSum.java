import java.util.HashMap;
import java.util.Map;

public class FourSum {
    private boolean isPresentNonDuplicates(int[] arr, int target) {
        Map<Integer, Integer> map = getMap(arr);
        int j = 0;
        int k = j+1;
        for(int i=k+1;i<arr.length;i++) {
            int exp = target - (arr[i] + arr[j] + arr[k]);
            if (map.containsKey(exp) && map.get(exp) != i) {
                return true;
            }
            j++;
            k++;
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
        FourSum obj = new FourSum();
        System.out.println(obj.isPresentNonDuplicates(new int[]{-2,3,4,8,1}, 13));


    }
}

