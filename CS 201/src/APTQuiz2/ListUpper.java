public class ListUpper {
    public ListNode uplist(String[] words) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (String word : words){
            int count = 0;
            for (int i = 0; i < word.length(); i++){
                if (Character.isUpperCase(word.charAt(i))){
                    count ++;
                }
            }
            curr.next = new ListNode(count);
            curr = curr.next;
        }
        return head.next;
    }
}