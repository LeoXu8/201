public class WeightedListSorter {
    public String[] sort(String[] words, ListNode weights) {
        Integer[] weightings = new Integer[words.length];
        ListNode curr = weights;
        for (int i = 0; i < words.length; i++){
            weightings[i] = curr.info;
            curr = curr.next;
        }
        for (int i = 0; i < words.length; i++){
            for (int j = i + 1; j < words.length; j++){
                if (weightings[i].compareTo(weightings[j]) > 0){
                    int temp = weightings[i];
                    weightings[i] = weightings[j];
                    weightings[j] = temp;
                    String temp2 = words[i];
                    words[i] = words[j];
                    words[j] = temp2;
                }
                if (weightings[i].compareTo(weightings[j]) == 0){
                    if (words[i].compareTo(words[j]) > 0){
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }
        return words;
    }
}