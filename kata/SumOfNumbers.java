public class Sum {

  public int GetSum(int a, int b) {
    if( a == b ) {
      return a;
    } else {
      int sum = 0;
      for(int i = Math.min(a,b); i < Math.max(a,b)+1; i++) {
        sum += i;
      }
      return sum;
    }
  }

}
