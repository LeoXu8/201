import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        Arrays.sort(data);
        int temp = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : data){
            if (map.containsKey(s)){
                temp = map.get(s);
                map.put(s, temp + 1);
            }
            else{
                map.put(s,1);
            }
        }
        
        TreeMap<String, Integer> tree = new TreeMap<String, Integer>((a,b) -> {
            if (map.get(a) == map.get(b)){
                return a.compareTo(b);
            }
            else{
                return map.get(b) - map.get(a);
            }
        });
        for (String s : map.keySet()){
            tree.put(s, map.get(s));
        }
        String[] sorted = new String[map.size()];
        int i = 0;
        for (String s : tree.keySet()){
            sorted[i] = s;
            i ++;
        }
        return sorted;
    }

    // public static void main(String[] args) {
    //     String[] data = {"apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"};
    //     System.out.println(Arrays.toString(sort(data)));
    // }
}