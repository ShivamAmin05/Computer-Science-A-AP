
//Name -
import static java.lang.System.*;

public class letterRemover {
  private String sentence;
  private char lookFor;

  public letterRemover() {
    // call set
    setRemover(sentence, lookFor);
  }

  // add in second constructor
  public letterRemover(String s, char rem) {
    // call set
    setRemover(s, rem);
  }

  public void setRemover(String s, char rem) {
    sentence = s;
    lookFor = rem;
  }

  public String removeLetters() {
    String cleaned = sentence;
    int loc = cleaned.indexOf(lookFor);
    while(loc != -1)
      {
        cleaned = cleaned.substring(0, loc) + cleaned.substring(loc+1);
        loc = cleaned.indexOf(lookFor);
      }
    return cleaned;
  }

  public String toString() {
    return sentence + " - letter to remove " + lookFor;
  }
}
