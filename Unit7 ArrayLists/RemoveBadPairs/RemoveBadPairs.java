import java.util.*;

class RemoveBadPairs {
  public ArrayList<Integer> removeBadPairs(ArrayList<Integer> list) {
    ArrayList<Integer> finalList = new ArrayList<Integer>();
    if (list.size() % 2 != 0)
      list.remove(list.size() - 1);

    for (int i = 1; i < list.size(); i += 2) {
      if (list.get(i) >= list.get(i - 1)) {
        finalList.add(list.get(i - 1));
        finalList.add(list.get(i));
      }
    }
    return finalList;
  }
}