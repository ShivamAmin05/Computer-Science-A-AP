
//Name - Shivam Amin
//Date - 11/14/22
//Class - CS A
//Lab  - Monster Check
import java.util.Scanner;
import static java.lang.System.*;

public class Main {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    // ask for name and size
    System.out.println("Enter the first monster's name");
    String name = keyboard.nextLine();
    System.out.println("Enter the first monster's size");
    int size = keyboard.nextInt();
    // instantiate monster one
    Monster monster1 = new Monster(name, size);

    // ask for name and size
    Scanner keyboard2 = new Scanner(System.in);
    System.out.println("Enter the second monster's name");
    String name2 = keyboard2.nextLine();
    System.out.println("Enter the second monster's size");
    int size2 = keyboard2.nextInt();
    // instantiate monster two
    Monster monster2 = new Monster(name2, size2);

    if (monster1.isBigger(monster2)) {
      System.out.println("Monster one is bigger than monster two");
    } else if (monster2.isBigger(monster1)) {
      System.out.println("Monster two is bigger than monster one");
    } else {
      System.out.println("Both monsters are the same size");
    }
    if (monster1.namesTheSame(monster2)) {
      System.out.println("Monster one has the same name as monster two");
    }

  }
}
