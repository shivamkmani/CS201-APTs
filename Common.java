public class Common {
    public int count(String a, String b) {
        int k = 0;
        String[] ax = new String[a.length()];
        String[] bx = new String[b.length()];
        while(k<a.length()){
            ax[k] = a.substring(k,k+1);
            bx[k] = b.substring(k,k+1);
            k++;
        }
        int count = 0;
        int o = 0;
        while(o<ax.length){
            if(isin(ax[o], bx)){
                boolean l = true;
                int p = 0;
                while(l){
                    if(bx[p].equals(ax[o])){
                        l = false;
                        bx[p] = "";
                    }
                    p++;
                }
                count++;
            }
            o++;
        }
        return count;

    }

    public boolean isin(String str, String[] j){
        int i = 0;
        while(i<j.length){
            if(str.equals(j[i])){
                return true;
            }
            i++;
        }
        return false;
    }
}