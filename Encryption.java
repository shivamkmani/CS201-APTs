import java.util.*;

public class Encryption {
    public String encrypt(String message) {

        String answer = "";
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] myChar = message.toCharArray();
        HashMap<Character,Character> charMap = new HashMap<>();
        ArrayList<Character> msgChar = new ArrayList<>();

        for (int i = 0;i < myChar.length; i++) {
            if (!msgChar.contains(myChar[i])) {
            msgChar.add(myChar[i]);
            }
        }
        for (int k = 0;k < msgChar.size(); k++) {
            charMap.putIfAbsent(msgChar.get(k), alpha[k]);
        }
        for (char c : myChar){
            answer += charMap.get(c);
        }



                return answer;
    }
}