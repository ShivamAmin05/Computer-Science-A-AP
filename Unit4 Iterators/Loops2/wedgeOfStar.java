import java.util.Scanner;
class wedgeOfStar {
  public wedgeOfStar()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Initial number of stars: ");
    int maxStars = input.nextInt();
    for(int stars = 0; stars < maxStars; stars++)
    {
      System.out.println("*".repeat(maxStars-stars));
    }
  }
}