
//Name - Shivam Amin
//Date - 11/18/22
//Lab  - Hex To Binary
import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinary {
  public static String getBinary(char hex) {
    if(hex - 65 > 5)
    {
      return hex + " is Error in Binary!";
    }
    return hex + " is " + Integer.toBinaryString(hex-55) + " in binary!";
  }
}