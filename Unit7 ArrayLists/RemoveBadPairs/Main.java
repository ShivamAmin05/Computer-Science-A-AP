import java.util.*;

class Main {
  public static void main(String[] args) {
    RemoveBadPairs method = new RemoveBadPairs();
    ArrayList<Integer> list = new ArrayList<>();

    list.add(3);
    list.add(7);
    list.add(9);
    list.add(2);
    list.add(5);
    list.add(5);
    list.add(8);
    list.add(5);
    list.add(6);
    list.add(3);
    list.add(4);
    list.add(7);
    list.add(3);
    list.add(1);

    System.out.println("The original list is" + list);
    System.out.println("The list after removing the bad pairs is" + method.removeBadPairs(list));
  }
}