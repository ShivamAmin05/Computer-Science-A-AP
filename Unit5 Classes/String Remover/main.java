import static java.lang.System.*;

public class main {
  public static void main(String args[]) {
    StringRemover test = new StringRemover("xR-MxR-MHelloxR-M", "R-M");
    out.println(test);
    out.println(test.removeStrings() + "\n\n");
    
    test.setRemover("sxsssxssxsxssexssxsesss", "xs");
    out.println(test);
    out.println(test.removeStrings() + "\n\n");

    test.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
    out.println(test);
    out.println(test.removeStrings() + "\n\n");
  }
}