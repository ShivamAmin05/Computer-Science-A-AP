import java.util.*;
class NameBackwards {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?: ");
    String name = input.nextLine();
    char[] namesList = name.toCharArray();

    System.out.println("Your name in reverse is: ");
    for(int i = namesList.length - 1; i >= 0; i--)
    {
     System.out.print(namesList[i]); 
    }
  }
}