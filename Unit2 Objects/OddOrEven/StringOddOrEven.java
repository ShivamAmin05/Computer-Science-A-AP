
//Name - Shivam Amin
//Date - 10/20/22
//Class - Computer Science A
//Lab  - String odd or even
import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven {
  private String word;

  public StringOddOrEven() {
    setString(null);
  }

  public StringOddOrEven(String s) 
  {
    setString(s);
  }

  public void setString(String s) {
    word = s;
  }

  public boolean isEven() {
    if(word.length() % 2 == 0)
    {
      return true;
    }
    return false;
  }

  public String toString() {
    String output = "";
    return output;
  }
}
