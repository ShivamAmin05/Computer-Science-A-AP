import java.util.*;

class MarkLengthFour {
  public ArrayList<String> markLengthFour(ArrayList<String> list) {

    ArrayList<String> finalList = new ArrayList<>();
    for (int i = 0; i < list.size(); i ++) {
      if(list.get(i).length() == 4)
      {
        finalList.add("****");
      }
      finalList.add(list.get(i));
    }
    return finalList;
  }
}