
import java.util.*;

public class MajorityElementII {

   /* Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

            Note: The algorithm should run in linear time and in O(1) space.

    Example 1:

    Input: [3,2,3]
    Output: [3]
    Example 2:

    Input: [1,1,1,3,3,2,2,2]
    Output: [1,2]*/

        public List<Integer> majorityElement(int[] nums) {
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            List<Integer> list= new ArrayList<Integer>();
            for(int i:nums){
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }
                else {
                    map.put(i,1);
                }
            }
            int count = nums.length/3;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue() > count){
                    list.add(entry.getKey());
                }
            }
            return list;
        }
        public static void main(String a[]){
            MajorityElementII obj = new MajorityElementII();
            Arrays.asList(obj.majorityElement(new int[]{1,1,1,3,3,2,2,2})).stream().forEach(i ->System.out.println(i));
        }
}
