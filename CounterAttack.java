import java.util.*;
public class CounterAttack {
    public int[] analyze(String str, String[] words) {
       int[] counter = new int[words.length];
       String[] found = str.split(" ");
       for (int i = 0; i < words.length; i++) {
           ArrayList<String> strlist = new ArrayList<>(Arrays.asList(found));
           counter[i] = Collections.frequency(strlist, words[i]);
       }
        return counter;
    }
}
