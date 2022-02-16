import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
            ArrayList<String> prepped = new ArrayList<>();
            for (String s: sentences) {
                prepped.addAll(Arrays.asList(s.toLowerCase().split(" ")));
            }

            int max = 0;
            String maxStr = "";

            for (String str: prepped) {
                int m = Collections.frequency(prepped, str);
                if (m > max) {
                    max = m;
                    maxStr = str;
                }
            }
            return maxStr;
        }
    }
