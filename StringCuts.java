import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> strs = new ArrayList<String>();

        for (int i = 0; i < list.length; i++) {
            if (list[i].length() >= minLength && !strs.contains(list[i])) {
                strs.add(list[i]);
        }
    }
        String[] answer = strs.toArray(new String[0]);
        return answer;
    }
}