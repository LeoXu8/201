public class SortedListRemoval {
    public ListNode uniqify(ListNode list) {
        if (list == null)
            return null;
        if (list.next == null)
            return list;
        ListNode head = list;
        while (list.next != null) {
            if (list.info == list.next.info) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    }
}