public class AccessLevel {
       public String canAccess(int[] rights, int minPermission) {
        String s = "";
        for(int n : rights) {
               if (n >= minPermission) {
                      s += "A";
               }
               else {
                      s += "D";
               }
        }
        return s;
       }
}
