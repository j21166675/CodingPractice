import java.util.HashMap;
import java.util.Map;

public class StickerCount {
    private int getCount(String sticker, String str) {
        int count =1;
        Map<Character, Integer> stickerMap = getStr2Map(sticker);
        printMap(stickerMap);
        Map<Character, Integer> str2Map = getStr2Map(str);
        for(char ch: str.toCharArray()){
            if(! stickerMap.containsKey(ch)){
                return -1;
            }
            if(str2Map.get(ch) > stickerMap.get(ch)){
               // System.out.println(" occ "+str2Map.get(ch) / stickerMap.get(ch));
                int temp = (str2Map.get(ch) / stickerMap.get(ch)) + (str2Map.get(ch) % 2);
                count = Math.max(count, temp);
            }
        }
        return count;
    }

    private Map<Character, Integer> getStr2Map(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        return map;
    }

    private void printMap(Map<Character, Integer> map) {
        System.out.println(map.toString());
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public static void main(String a[]){
        StickerCount obj = new StickerCount();
       System.out.println( obj.getCount("facebook", "cee"));
    }
}
