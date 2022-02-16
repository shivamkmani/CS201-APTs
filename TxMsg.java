public class TxMsg {
    public String getMessage(String original) {
      char[] temp = original.toCharArray();
      char[] vowels = {'a', 'e', 'i', 'o', 'u'};
      for (int i = 0; i < temp.length; i++) {
        if (in(vowels[i], temp[i])) {

        }
      }
      return "your mom";
    }

    public boolean in(char k, String j){
      int i = 0;
      while(i < j.length()){
          if(k == j.charAt(i)) {
              return true;
          }
          i++;
      }
      return false;
  }
 }