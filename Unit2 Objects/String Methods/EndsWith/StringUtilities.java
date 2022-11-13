//Name - Shivam Amin
//Date - 10/10/22
//Lab  - EndsWith
import static java.lang.System.*; 
import java.util.Scanner;
public class StringUtilities
{
  public static boolean endsWith(String a, String b)
  {

    if((a.substring( a.length()-b.length() )).equals(b))
    {
      return true;
    }

    return false;
  }
}