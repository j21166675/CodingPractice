import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesUnSortedArr {
    private void removeDuplicates(int[] nums){
        Map<Integer, Boolean> map =new HashMap<>();
        for(int i:nums){
            map.put(i,true);
        }
      map.keySet().stream().forEach(System.out::println);
    }
    public static void main(String a[]){
        RemoveDuplicatesUnSortedArr obj = new RemoveDuplicatesUnSortedArr();
        obj.removeDuplicates(new int[]{2,3,5,2,4,7,5,3,6,8});
    }
}
