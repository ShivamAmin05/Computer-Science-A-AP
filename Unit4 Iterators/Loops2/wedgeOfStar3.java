import java.util.Scanner;
class wedgeOfStar3 {
  public wedgeOfStar3()
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
    for(int stars = maxStars - 1; stars >= 0; stars --)
    {
      System.out.print(" ".repeat(maxStars-stars));
      System.out.print("*".repeat((2 * stars) + 1));
      System.out.println(" ".repeat(maxStars - 1 / 2)); 
    }
  }
}