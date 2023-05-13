/**
 * BusinessAcct class.
 */
public class BusinessAcct extends Account {
    /**
     * constructor
     * pre: none
     * post: A business account has been created. Balance and
     * customer data has been initialized with parameters.
     */
    public BusinessAcct(double bal, String fName, String lName, String str,
        String city, String st, String zip) {
      super(bal, fName, lName, str,
          city, st, zip);
    }
  
    /**
     * A withdrawal is made from the account if there is enough money.
     * A $10 fee is charged if the withdrawal causes the balance to fall below
     * $500.
     * pre: none
     * post: The balance has been decreased by the amount withdrawn and a
     * charge has been assessed if the balance fell below $500.
     */
    public void withdrawal(double amt) {
      super.withdrawal(amt);
      if (getBalance() < 500) {
        super.withdrawal(10);
        System.out.println("A 10$ fee has been charged because the amount of money in the account is now less than 500$.");
      }
    }
  }
  