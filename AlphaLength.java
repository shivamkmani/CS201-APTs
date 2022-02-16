import java.util.*;

public class AlphaLength {
    public ListNode create(String[] words) {
        List<String> word_set = new ArrayList<>(new TreeSet<String>(Arrays.asList(words)));
        int initial = word_set.get(0).length();
        ListNode ln = new ListNode(initial);
        ListNode first = ln;

        for(int i = 1; i < word_set.size(); i++) {
                ln.next = new ListNode(word_set.get(i).length());
                ln = ln.next;
        }

    return first;
    }
}
