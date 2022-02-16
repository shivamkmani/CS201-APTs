public class Totality {
    public int sum(int[] a, String stype) {
        int evenVal = 0;
        int oddVal = 0;
        for (int i = 0; i < a.length; i+=1) {
            if (i % 2 == 0) {
                evenVal += a[i];
            }
            else {
                oddVal += a[i];
            }
        }
        if (stype.equals("even")) {
            return evenVal;
        }
        if (stype.equals("odd")) {
            return oddVal;
        }
        return oddVal + evenVal;
    }
}