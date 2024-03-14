import java.util.Arrays;
import java.util.Comparator;

public class LengthSort {
    public String[] rearrange(String[] values) {
        Arrays.sort(values);
        Arrays.sort(values, Comparator.comparing(String::length).thenComparing(String::));
        return values;
    }

    // public static void main(String[] args) {
    //     String[] values = {"dog", "ant", "cat"};
    //     String[] sorted = rearrange(values);
    //     for (String s : sorted) {
    //         System.out.println(s);
    //     }
    // }
}
