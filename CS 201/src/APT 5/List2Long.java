public class List2Long {
    public long convert(ListNode list) {
        String sb = "";
        ListNode curr = list;
        while (curr != null) {
            sb += curr.info;
            curr = curr.next;
        }
        return Long.parseLong(sb);
    }
}
