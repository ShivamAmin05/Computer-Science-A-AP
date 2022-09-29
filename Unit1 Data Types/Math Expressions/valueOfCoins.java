import java.util.Scanner;
import java.text.NumberFormat;
class valueOfCoins {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print ("Enter the numbers of quarters in the jar: "); 
    int quarters = input.nextInt();
    System.out.print ("Enter the numbers of nickels in the jar: "); 
    int nickels = input.nextInt();
    System.out.print ("Enter the numbers of dimes in the jar: "); 
    int dimes = input.nextInt();
    System.out.print ("Enter the numbers of pennies in the jar: "); 
    int pennies = input.nextInt();

    double totalValue = ((quarters * 25) + (nickels * 5) + (dimes * 10) + pennies) / 100.0 ;
  
    NumberFormat money = NumberFormat.getCurrencyInstance();
    System.out.println ("The value of the coins in the jar is " + money.format(totalValue));
  }
}