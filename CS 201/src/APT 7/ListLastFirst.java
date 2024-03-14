public class ListLastFirst {
    public ListNode move(ListNode list) {
        if (list == null || list.next == null)
            return list;
        ListNode head = list;
        while (list.next.next != null) {
            list = list.next;
        }
        ListNode store = list.next;
        list.next = null;
        store.next = head;

        return store;
    }
}