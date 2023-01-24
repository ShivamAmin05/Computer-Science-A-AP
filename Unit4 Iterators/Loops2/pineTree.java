import java.util.Scanner;
class pineTree {
  public pineTree()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Initial number of stars: ");
    int maxStars = input.nextInt();
    for(int stars = 0; stars < maxStars; stars ++)
    {
      System.out.print(" ".repeat(maxStars-stars));
      System.out.print("*".repeat((2 * stars) + 1));
      System.out.println(" ".repeat(maxStars - 1 / 2)); 
    }
    for(int trunk = 0; trunk < 3; trunk ++)
    {
      System.out.print(" ".repeat(maxStars - 1));
      System.out.println("*".repeat(3));
    }
  }
}