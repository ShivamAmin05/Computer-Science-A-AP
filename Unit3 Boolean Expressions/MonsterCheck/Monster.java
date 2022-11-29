//Name - Shivam Amin
//Date - 11/14/22
//Class - CS A
//Lab  - Monster Check

import static java.lang.System.*;

public class Monster {
  private String name;
  private int howBig;

  public Monster() {

  }

  public Monster(String n, int size) {
    name = n;
    howBig = size;
  }

  public String getName() {
    return name;
  }

  public int getHowBig() {
    return howBig;
  }

  public boolean isBigger(Monster other) {
    return (howBig > other.getHowBig());
  }

  public boolean isSmaller(Monster other) {
    // call isBigger() use !
    return !(isBigger(other));
  }

  public boolean namesTheSame(Monster other) {
    if (name.equals(other.getName())) {
      return true;
    }
    return false;
  }

  public String toString() {
    return "";
  }
}
