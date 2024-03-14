import java.util.ArrayList;

public class SimpleHash {
    public int hashValue(String word){
            int hash = 0;
            for (int i = 0; i < word.length(); i++){
                hash += word.charAt(i) -'a'+1;
            }
            return hash;
        }

    public String[] calculate(String[] list){
        ArrayList<String> output = new ArrayList<String>();
        ArrayList<String> converted = new ArrayList<String>();
        for (String word : list){
            converted.add(word);
        }
        int count = 0;
        int first;
        String build;
        while (converted.size() > 0){
            build = "";
            first = hashValue(converted.get(0));
            for (int i = 0; i < converted.size(); i++){
                if (hashValue(converted.get(i)) == first){
                    count++; //finds how many other strings have the same hashcode as the first
                    build += converted.get(i) + " "; //separates each element with the same hashcode as the first one with a space in a new string
                    converted.remove(i); //removes the element from the list
                    i --; //decrements i so that the next element in the list is not skipped
                }
            }
            if (count > 2){
                build = first +":" + build;
                build = build.substring(0, build.length()-1); //removes the last space
                output.add(build);
            }
            count = 0;
        }

        //sorting the array
        String[] sorted = new String[output.size()];
        int k = 0;
        for (int i = 0; i < 300; i ++){
            for (String s : output){
                if (s.startsWith(i+":")){
                    sorted[k] = s;
                    k++;
                }
            }
        }
        return sorted;
    }
        
    public static void main(String[] args) {
        String[] list = {"dad", "bear", "ace", "data", "can", "ebb", "dog", "deed"};
        SimpleHash s = new SimpleHash();
        String[] result = s.calculate(list);
        for (String t : result){
            System.out.println(t);
        }
        
    }
}