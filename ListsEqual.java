import java.util.*;

public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
        List a1_list = new ArrayList<>();
        List a2_list = new ArrayList<>();

        while (a1 != null) {
            a1_list.add(a1.info);
            a1 = a1.next;
        }
        while (a2 != null) {
            a2_list.add(a2.info);
            a2 = a2.next;

        }

        if (a1_list.equals(a2_list)) {
            return 1;
        } else {
        return 0;
    }
    }
}
