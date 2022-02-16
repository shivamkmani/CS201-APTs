import java.util.*;

public class SetAside {
    public String common(String[] list) {

        ArrayList<String> strList = new ArrayList<String>();
        String str = list[0];
        String[] strAr = str.split(" ");

        for (int i = 0; i < strAr.length; i++) {
            if(!strList.contains(strAr[i])) {
                strList.add(strAr[i]);
            }
        }

        for (int k = 0; k < list.length; k++) {
            String t = list[k];
            String[] b = t.split(" ");
            ArrayList<String> nu = new ArrayList<String>(Arrays.asList(b));
            strList.retainAll(nu);
        }

        Collections.sort(strList);
        return String.join(" ", strList);
    }
}