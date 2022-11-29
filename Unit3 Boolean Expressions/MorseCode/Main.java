//Name - Shivam Amin
//Date - 11/29/22
//Class - CS A
//Lab  - Morse Code 
import static java.lang.System.*; 
import java.util.Scanner;
public class Main
{
public static void main( String args[] )
{
  MorseCode code = new MorseCode();
  code.setChar('A');
  System.out.println(code);
  code.setChar('B');
  System.out.println(code);
  code.setChar('3');
  System.out.println(code);
  code.setChar('Z');
  System.out.println(code);
  code.setChar('8');
  System.out.println(code);
  code.setChar('F');
  System.out.println(code);
  code.setChar('0');
  System.out.println(code);
}
}