import java.util.ArrayList;

public class EndOfWords {
    public String[] filter(String[] words){
        String each;
        ArrayList<String> output = new ArrayList<String>();
        boolean add = true;
        for (int i = 0; i < words.length; i++){
            each = words[i];
            if (each.substring(0,1).equals(each.substring(each.length()-1, each.length()))){
                for (String s : output){
                    if (s.substring(0,1).equals(each.substring(0,1))){
                        add = false;
                    }
                }
                if (add){
                    output.add(each);
                }
                add = true;
            }
        }
        words = output.toArray(new String[output.size()]);
        return words;
    }
  }