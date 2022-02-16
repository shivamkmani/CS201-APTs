public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int nucleoMax = 0;
        String currentMax = "";
        char nuck = nuc.charAt(0);  

        for (String s : strands) {
            int num = freq(s, nuck);
            if (num > nucleoMax) {
                nucleoMax = freq(s, nuck);
                currentMax = s;
            }
            else if (num == nucleoMax && currentMax.length() < s.length()) {
                currentMax = s;
            }
            else if () {}
        }
        return currentMax;
    }

    public int freq(String frag, char nucky) { 
        int counting = 0;
        for (char sub : frag.toCharArray()) {
            if (sub == nucky) {
                counting++;
                }
            }
        return counting;
    }
}