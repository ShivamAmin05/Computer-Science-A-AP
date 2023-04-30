
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Shivam Amin
//Date - 4/23/2023
import java.util.List;
import java.util.ArrayList;

public class ListDown {
  // go() will return true if all numbers in numArray
  // are in decreasing order [31,12,6,2,1]
  public static boolean go(List<Integer> numArray) {
    int prevNum = Integer.MAX_VALUE;
    for(int i: numArray)
      {
        if(prevNum < i)
          return false;
        prevNum = i;
      }
    return true;
  }
}
