import java.util.*;
class Main {
  public static void main(String[] args) {
    SwitchPairs method = new SwitchPairs();
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    list1.add("four");
    list1.add("score");
    list1.add("and");
    list1.add("seven");
    list1.add("years");
    list1.add("ago");

    list2.add("to");
    list2.add("be");
    list2.add("or");
    list2.add("not");
    list2.add("to");
    list2.add("be");
    list2.add("hamlet");

    System.out.println("The original list is" + list1);
    System.out.println("The list after flipping pairs is" + method.switchPairs(list1));
    System.out.println();
    System.out.println("The original list is" + list2);
    System.out.println("The list after flipping pairs is" + method.switchPairs(list2));
    
  }
}