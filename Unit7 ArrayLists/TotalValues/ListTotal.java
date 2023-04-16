import java.util.ArrayList;
import java.util.List;

public class ListTotal {
  public static int go(List<Integer> ray) {
    int sum = 0;
    for (Integer i : ray) {
      sum += i;
    }
    return sum;
  }
}
