import java.util.Arrays;

public class LengthSort {
    public String[] rearrange(String[] values) {
        Arrays.sort(values);
        String temp;
        for (int i = 0; i < values.length; i ++){
            for (int j = 0; j < values.length - 1; j ++){
                if (values[j].length() > values[j+1].length()){
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j+1] = temp;
                }
            }
        }
        return values;
    }
}