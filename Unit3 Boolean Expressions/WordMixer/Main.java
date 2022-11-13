
//Name - Shivam
//Date - 11/10/22
//Class - CS A
//Lab  - Boolean Expressions - WordMixer
import static java.lang.System.*;

public class Main {
  public static void main(String args[]) {
    WordMixer s = new WordMixer();
    System.out.println(s.moveEmAround("apluscompsci", 3));
    System.out.println(s.moveEmAround("apluscompsci", 5));
    System.out.println(s.moveEmAround("apluscompsci", 1));
    System.out.println(s.moveEmAround("apluscompsci", 2));
    System.out.println(s.moveEmAround("apluscompsci", 30));
    System.out.println(s.moveEmAround("apluscompsci", 4));
  }
}
