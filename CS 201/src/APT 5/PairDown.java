import java.util.Arrays;

public class PairDown {
     public int[] fold(int[] list) {
            list = step(list);
         return list;
     }

     public int[] step(int[] list){
        int[] result;
        if (list.length % 2 == 1){
            result = new int[list.length/2 + 1];   
        }
        else{
            result = new int[list.length/2];   
        }

        for (int i = 0; i < list.length; i++){
                result[i/2] += list[i];
            }
        return result;
     }

 }
 