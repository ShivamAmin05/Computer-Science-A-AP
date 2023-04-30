
//Name - Shivam Amin
//Date - 4/22/2023
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ListLast {
  public static boolean go(List<Integer> ray) {
    int lastNum = ray.get(ray.size() - 1);
    return(Collections.frequency(ray,lastNum) > 1);
  }
}
