public class DoubleList {
    public ListNode bigify(ListNode list) {
        return stretch(list, 2);
    }
    public ListNode stretch (ListNode list, int amount){
    if (list == null) return null;
    ListNode res = new ListNode(list.info);
    ListNode head = res;
    while (list != null){
        for (int i = 0; i < amount; i++){
            res.next = new ListNode(list.info);
            res = res.next;
        }
        list = list.next;
    }
    return head.next;
}
}