import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {

        HashMap<String, Integer> answer = new HashMap<>();
        ArrayList<String> fans = new ArrayList<>();
        String[][] assistant = {new HashSet<String>(Arrays.asList(club1)).toArray(new String[new HashSet<String>(Arrays.asList(club1)).size()]),
            new HashSet<String>(Arrays.asList(club2)).toArray(new String[new HashSet<String>(Arrays.asList(club2)).size()]),
            new HashSet<String>(Arrays.asList(club3)).toArray(new String[new HashSet<String>(Arrays.asList(club3)).size()])
        };

        for (String[] strs : assistant) {
            for (String h : strs){
                answer.putIfAbsent(h,0);
                answer.put(h, answer.get(h) + 1);
            }
            
        }

        for (String strsB : answer.keySet()) {
            if (answer.get(strsB) >= 2) {
                fans.add(strsB);
            }
        }           
        Collections.sort(fans);
        System.out.println(fans);
        return fans.toArray(new String[fans.size()]);
        }
    }