import java.util.Scanner;
import java.text.NumberFormat;

class PayProgram {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();

    System.out.println("\nWelcome to the pay program");
    System.out.println("\nPlease enter your hourly wage: ");
    float wage = input.nextFloat();

    System.out.println("\nPlease enter your weekly hours: ");
    float regHours = input.nextFloat();

    System.out.println("\nPlease enter your overtime hours: ");
    float overtimeHours = input.nextFloat();

    float overtimePay = (float) (overtimeHours * (1.5 * wage));
    float weeklyPay = (wage * regHours);
    float totalWeeklyPay = weeklyPay + overtimePay;
    System.out.println("\nFrom overtime you made: " + money.format(overtimePay));
    System.out.println("\nWeekly pay: " + money.format(totalWeeklyPay));

    float monthlyPay = (float) (weeklyPay * 4);
    System.out.println("\nMonthly pay: " + money.format(monthlyPay));

    float yearlyPay = monthlyPay * 12;
    System.out.println("\nYearly pay: " + money.format(yearlyPay));

    System.out.println("\nEnter Bonus Percentage: ");
    float bonus = input.nextFloat();
    float bonusPay = bonus * yearlyPay;
    System.out.println("\nBonus: " + money.format(bonusPay));

    float finalPay = yearlyPay + (yearlyPay * bonus);
    System.out.println("\nYour total pay including bonus is: " + money.format(finalPay));

  }
}