import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class creditCardBill {
  public static void main(String[] args) {
    Locale locale = new Locale("en", "US");      
    NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
    int totalPayment = 0;
    String space = "          ";
    String space2 = "                 ";
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the starting balance");
    float debt = input.nextFloat();
    System.out.println("Enter the monthly payment");
    int monthlyPayment = input.nextInt();
    System.out.println("Enter the interest percentage(0-100)");
    float interest = input.nextFloat();
    System.out.println(interest);
    while(debt > monthlyPayment)
    {
      totalPayment += monthlyPayment;
      debt += debt * (interest / 1000) - monthlyPayment;
      String output1 = "Month " + (totalPayment/monthlyPayment) + ": ";
      String output2 = "" + nf.format(debt);
      output1 += space.substring(0, space.length() - output1.length());
      output2 += space2.substring(0, space2.length() - output2.length());
      System.out.println(output1 + "balance: " + output2 + " total payments: " + nf.format(totalPayment));   
    }
    System.out.println("You need to enter a payment of " + nf.format(debt + (debt * (interest/1000))) + " to make the balance zero.");
  }
}