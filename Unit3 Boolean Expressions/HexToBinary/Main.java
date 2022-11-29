//Name - Shivam Amin
import static java.lang.System.*;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    HexToBinary prog = new HexToBinary();
    Scanner keyboard = new Scanner(System.in);
    out.print("Enter a letter :: ");
    char letter = keyboard.next().charAt(0);
    out.println(prog.getBinary(letter));
    out.print("Enter a letter :: ");
    letter = keyboard.next().charAt(0);
    out.println(prog.getBinary(letter));
    out.print("Enter a letter :: ");
    letter = keyboard.next().charAt(0);
    out.println(prog.getBinary(letter));
    out.print("Enter a letter :: ");
    letter = keyboard.next().charAt(0);
    out.println(prog.getBinary(letter));
    out.print("Enter a letter :: ");
    letter = keyboard.next().charAt(0);
    out.println(prog.getBinary(letter));
    out.print("Enter a letter :: ");
    letter = keyboard.next().charAt(0);
    out.println(prog.getBinary(letter));
    out.print("Enter a letter :: ");
    letter = keyboard.next().charAt(0);
    out.println(prog.getBinary(letter));
  }
}