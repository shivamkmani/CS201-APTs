import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        
        String[] mutate = String.join(" ", list).split(" ");
        Set<String> fin = new TreeSet<>();
        
        for (String str : mutate) {
            fin.add(str);
        }

        Iterator<String> iterator = fin.iterator();
        ArrayList<String> jie = new ArrayList<>(); 

        while(iterator.hasNext()) {
            jie.add(iterator.next());
        }

        return String.join(" ", jie);
    }

public static void main(String[] args) {
    Closet cl = new Closet();
    String[] pass = {"a b c d", "b c d", "b c d e", "b c f"};
    System.out.println(cl.anywhere(pass));
}
}