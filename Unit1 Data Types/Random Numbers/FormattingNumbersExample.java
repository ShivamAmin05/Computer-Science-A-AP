//********************************************************************
 // Price.java Author: Lewis/Loftus 
// 
// Demonstrates the use of various Keyboard and NumberFormat // methods. //******************************************************************** 
import java.util.Scanner; 
import java.text.NumberFormat; 
public class FormattingNumbersExample
{ 
//----------------------------------------------------------------- 
// Calculates the final price of a purchased item using values // entered by the user. //----------------------------------------------------------------- 
      public static void main (String[] args) 
      {
          Scanner Keyboard = new Scanner(System.in);
           final double TAX_RATE = 0.06;
           // 6% sales tax int quantity; 
          double subtotal, tax, totalCost, unitPrice;
          int quantity;
          System.out.print ("Enter the quantity: "); 
          quantity = Keyboard.nextInt();
          System.out.print ("Enter the unit price: ");
          unitPrice = Keyboard.nextDouble();
          subtotal = quantity * unitPrice;
          tax = subtotal * TAX_RATE;
          totalCost = subtotal + tax;
          // Print output with appropriate formatting
         NumberFormat money = NumberFormat.getCurrencyInstance();
         NumberFormat percent = NumberFormat.getPercentInstance();
         System.out.println ("Subtotal: " + money.format(subtotal));
         System.out.println ("Tax: " + money.format(tax) + " at " + percent.format(TAX_RATE));  
         System.out.println ("Total: " + money.format(totalCost));
      }
 }
