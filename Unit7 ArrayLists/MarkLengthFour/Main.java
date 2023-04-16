import java.util.*;

class Main {
  public static void main(String[] args) {
    MarkLengthFour method = new MarkLengthFour();
    ArrayList<String> list = new ArrayList<>();

    list.add("this");
    list.add("is");
    list.add("lots");
    list.add("of");
    list.add("fun");
    list.add("for");
    list.add("every");
    list.add("java");
    list.add("programmer");

    System.out.println("The original list is" + list);
    System.out.println("The list after adding in the new elements is" + method.markLengthFour(list));
  }
}