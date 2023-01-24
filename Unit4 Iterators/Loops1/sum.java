import java.util.Scanner;
class sum {

  public sum()
  {
    int total = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("How many inputs will be added:");
    int numInputs = input.nextInt();
    for(int i = 0; i < numInputs; i++)
      {
        System.out.println("Enter a number:");
        total += input.nextInt();
      }
    System.out.println("The sum is " + total);
  }
}