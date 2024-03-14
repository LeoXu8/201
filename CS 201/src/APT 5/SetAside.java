import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SetAside {
      public String common(String[] list) {
        
        String[] first = list[0].split(" ");
        boolean inside;

        ArrayList<String> result = new ArrayList<>();
            
        String[] current;
        for (String m : first){ //loops through each message in m, checks for each String in list if it belongs
            inside = true;
            for (String s : list){
                current = s.split(" ");
                
                if (!Arrays.asList(current).contains(m)){
                    inside = false;
                }
            }
            if (inside && !result.contains(m)){
                result.add(m);
            }
        }
        Collections.sort(result);

        return String.join(" ",result);
      }
  }