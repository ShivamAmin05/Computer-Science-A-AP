import java.util.Scanner;
class wedgeOfStar2 {
  public wedgeOfStar2()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Initial number of stars: ");
    int maxStars = input.nextInt();
    for(int stars = 0; stars <= maxStars; stars++)
    {
      System.out.print(" ".repeat(maxStars-stars));
      System.out.println("*".repeat(stars));
    }
  }
}