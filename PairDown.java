public class PairDown {
    public int[] fold(int[] list) {

        int[] result;

        if (list.length % 2 != 0) {
            result = new int[(list.length+1)/2];
        } else {
            result = new int[list.length/2];
        }

        int ind = 0;

        for (int k = 0; k < list.length - 1; k+=2) {
            result[ind] = list[k] + list[k + 1];
            ind++; 
            }

        if (list.length % 2 == 1) {
            result[ind] = list[list.length-1];
        }
        
        return result; 
    }
}
