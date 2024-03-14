import java.util.*;
public class SortedFreqs {
    public int[] freqs(String[] data) {
        Arrays.sort(data);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (data.length == 0) return new int[0];
        int count = 0;
        for (int i = 0; i < data.length - 1; i ++){
            if (data[i].equals(data[i + 1])){
                count ++;
            }
            else{
                list.add(count + 1);
                count = 0;
            }
        }
        
        list.add(count + 1);
        int[] sorted = new int[list.size()];
        for (int i = 0; i < list.size(); i ++){
            sorted[i] = list.get(i);
        }
        return sorted;
    }
}