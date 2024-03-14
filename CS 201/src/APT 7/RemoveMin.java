public class RemoveMin {
    public ListNode remove (ListNode list) {
        if (list == null) return null;
        if (list.next == null) return null;
        ListNode head = list;

        ListNode min = list;
        int minimum = list.info;
        while (min != null){
            if (min.info < minimum){
                minimum = min.info;
            }
            min = min.next;
        }
        if (head.info == minimum){
            return head.next;
        }
        while (list.next != null){
            if (list.next.info == minimum){
                list.next = list.next.next;
                return head;
            }
            list = list.next;
        }
        
    return head;
    }
}