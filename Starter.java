import java.util.*;
public class Starter {
    public int begins(String[] words, String first) {
        int count = 0;
        HashSet<String> set = new HashSet();
        for (String s : words) {
            set.add(s);
        }
        for (String s : set) {
            if (s.startsWith(first)) count = count + 1;
        }
        return count;
    }
    }