import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindingIntersect {
    private ArrayList<Integer> retIntersect(int[] num1, int[] num2){
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       ArrayList<Integer> list = new ArrayList<>();
        for(int a:num1){
            map.put(a,1);
        }
        for(int a:num2){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static void main(String a[]){
        FindingIntersect obj = new FindingIntersect();
        int[] num1 = {1,4,5,6,7,1,9};
        int[] num2 = {-9,6,-7,6,8,9,0,1};
        System.out.println(obj.retIntersect(num1, num2).toString());
    }
}
