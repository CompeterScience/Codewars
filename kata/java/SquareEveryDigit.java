public class SquareDigit {

  public int squareDigits(int n) {
    int size = String.valueOf(n).length();
    int remainder = n;
    String squared = "";
    
    for(int i=0; i<size; i++) {
      int place = (int) Math.pow(10, size-i-1);
      int digit = (int) Math.floor(remainder / place);
      remainder -= digit * place;
      int square = digit * digit;
      squared += String.valueOf(square);
    }
    
    return Integer.valueOf(squared);
  }
  
}
