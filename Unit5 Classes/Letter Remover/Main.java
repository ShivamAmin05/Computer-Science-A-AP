import static java.lang.System.*;

public class Main {
  public static void main(String args[]) {
    LetterRemover test = new LetterRemover("I am Sam I am", 'a');
    out.println(test);
    out.println(test.removeLetters() + "\n\n");
    test.setRemover("ssssssssxssssesssssesss", 's');
    out.println(test);
    out.println(test.removeLetters() + "\n\n");
    test.setRemover("qwertyqwertyqwerty", 'a');
    out.println(test);
    out.println(test.removeLetters() + "\n\n");
    test.setRemover("abababababa", 'b');
    out.println(test);
    out.println(test.removeLetters() + "\n\n");
    test.setRemover("abaababababa", 'x');
    out.println(test);
    out.println(test.removeLetters() + "\n\n");
  }
}