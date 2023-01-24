import java.util.Scanner;
class thirtyCharacters {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter word one: ");
    String word1 = input.nextLine();
    System.out.println("Enter word two: ");
    String word2 = input.nextLine();
    if(word1.length() + word2.length() > 30)
    {
      System.out.println("The two words are longer than thirty characters.");
    }
    System.out.println(word1 + ".".repeat(30 -(word1.length()+word2.length())) + word2);
    
  }
}