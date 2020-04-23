public class Accumul {
    
    public static String accum(String s) {
      String str = "";     
      for(int i=0; i<s.length(); i++) {
        char c = s.charAt(i);
        str = str + "-" + String.valueOf( Character.toUpperCase(c) );
        for(int j=0; j<i; j++) {
          str = str + String.valueOf( Character.toLowerCase(c) );
        }
      }
      return str.substring(1);
    }
    
}
