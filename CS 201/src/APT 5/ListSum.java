public class ListSum {
    public int sum(ListNode list, int thresh) {
        int count = 0;
        ListNode current = list; // Start at the head of the linked list

        while (current != null) {
            if (current.info > thresh){
                count += current.info; 
            }           // Increment the count for each node
            current = current.next; // Move to the next node
        }

        return count;
    }
}


