import java.util.*;
class CountLetters {
  public static void main(String[] args) {
    int numLetters = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a phrase: ");
    String phrase = input.nextLine();
    char[] phraseList = phrase.toCharArray();
    for(char l: phraseList)
    {
     if(Character.isAlphabetic(l))
     {
       numLetters += 1;
     }
    }
    System.out.println("There are " + numLetters + " letters in this phrase");
  }
}