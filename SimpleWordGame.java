public class SimpleWordGame{
    public int points(String[] player,
                      String[] dictionary) {
        int i = 0;
        int j = 0;
        int sum = 0;
        String[] ss = new String[player.length];
        while (i < player.length){
            if(in(player[i], dictionary) && ! in(player[i], ss)){
                ss[j] = player[i];
                sum = sum + player[i].length() * player[i].length();
                j++;
            }
            i++;

        }
        return sum;


    }

    public boolean in(String k, String[] j){
        int i = 0;
        while(i < j.length){
            if(k.equals(j[i])){
                return true;
            }
            i++;
        }
        return false;
    }


}