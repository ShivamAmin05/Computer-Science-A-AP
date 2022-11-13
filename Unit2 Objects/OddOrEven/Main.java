//Name - Shivam Amin
//Date - 10/20/22
//Class - Computer Science A
//Lab  - String odd or even
import static java.lang.System.*;
import java.util.Scanner;
public class Main
{
public static void main ( String[] args )
{
  StringOddOrEven word = new StringOddOrEven();
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a word:: ");
  String userWord = input.nextLine();
  word.setString(userWord);
  if(word.isEven())
  {
    System.out.println(word + "is even");
  }
  else
  {
    System.out.println(word + "is odd");
  }
  System.out.println("Enter a word:: ");
  String userWord2 = input.nextLine();
  word.setString(userWord2);
  if(word.isEven())
  {
    System.out.println(word + "is even");
  }
  else
  {
    System.out.println(word + "is odd");
  }
  System.out.println("Enter a word:: ");
  String userWord3 = input.nextLine();
  word.setString(userWord3);
  if(word.isEven())
  {
    System.out.println(word + "is even");
  }
  else
  {
    System.out.println(word + "is odd");
  }
}
}
