
//Name - Shivam
//Date - 11/10/22
import static java.lang.System.*;

public class WordMixer {
  public static String moveEmAround(String a, int x) {
    if (x > a.length()) {
      return "no can do";
    }
    return(a.substring(x) + a.substring(0,x));
    }  
  }