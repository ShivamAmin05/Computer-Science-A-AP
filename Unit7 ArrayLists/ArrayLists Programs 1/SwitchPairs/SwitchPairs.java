import java.util.*;
class SwitchPairs {
  public ArrayList<String> switchPairs(ArrayList<String> list){
  
    for(int i = 1; i < list.size(); i += 2)
    {
      String temp = list.get(i);
      list.set(i, list.get(i-1));
      list.set(i-1, temp);
    }
    return list;
  }
}