public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        boolean eq = true;

        while (a1 != null){
            if (a2 == null){
                eq = false;
                break;
            }
            if (a1.info != a2.info){
                eq = false;
                break;
            }
            a1 = a1.next;
            a2 = a2.next;
        }
        if (eq && a2 != null)
            eq = false;
        if (eq){
            return 1;
        }
	    return 0;
      }
  }