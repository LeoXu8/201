import java.util.ArrayList;
import java.util.Arrays;

public class AlphaLength {
    public ListNode create (String[] words) {
        Arrays.sort(words);
        ArrayList<String> converted = new ArrayList<String>();
        for (String word : words){
            if (converted.contains(word)){
                continue;
            }
            converted.add(word);
        }
        ListNode<String> head = new ListNode<String>(converted.get(0));
        ListNode current = head;
        for (String word : converted){
            current.next = new ListNode(word);
            current = current.next;
        }

	return head;
    }
}