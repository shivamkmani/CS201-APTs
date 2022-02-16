public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        
        int sum = 0;
        int[] ast = getCounts(headlines);

        for (String msg : messages) {
            int[] msgs = getCounts(msg.split(" "));
            boolean bool = true;
            int i = 97;

            while(i < 123) {
                if(ast[i] < msgs[i]) {
                    bool = false;
                }
                i++;
            }
            if (bool == true) {
                sum += 1;
            }

        }
        return sum;
    }

    private int[] getCounts(String[] strings) {
        int[] counta = new int[200];
        for (String str : strings) {
            for (char ch : str.toLowerCase().toCharArray()) {
                counta[ch] += 1;
            }
        }
        return counta;
    }
}
