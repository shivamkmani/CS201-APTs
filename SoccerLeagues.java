import java.util.*;

public class SoccerLeagues {
    public int[] points(String[] matches) {

        int[] fans = new int[matches.length];
        ArrayList<String> help = new ArrayList<>();
        String str_format = "";

        for (int i = 0;i < matches.length; i++) {
            str_format += matches[i] + ".";
            
            for (int k = 0;k < matches.length; k++) {
                str_format += matches[k].charAt(i);
                }
            
            help.add(str_format);
            str_format = "";
        }

        for (int d = 0;d < help.size(); d++) {
            for (int l =0;l < help.get(d).length(); l++) {
                if (l < help.get(d).indexOf('.')){
                    if (help.get(d).charAt(l) == 'W') {
                        fans[d] += 3;
                    } else if (help.get(d).charAt(l) == 'D') {
                        fans[d] += 1;
                    }
                } else if (l > help.get(d).indexOf('.')) {
                    if (help.get(d).charAt(l) == 'L') {
                        fans[d] += 3;
                    } else if (help.get(d).charAt(l) == 'D') {
                        fans[d] += 1;
                    }
                }
            }
            
        
        }
        
        return fans;
    }
}