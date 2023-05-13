/**
 * PersonalAcct class.
 */
public class PersonalAcct extends Account {
    /**
     * constructor
     * pre: none
     * post: A personal account has been created. Balance and
     * customer data has been initialized with parameters.
     */
    public PersonalAcct(double bal, String fName, String lName, String str,
        String city, String st, String zip) {
      super(bal, fName, lName, str, city, st, zip);
    }
  
    /**
     * A withdrawal is made from the account if there is enough money.
     * A $2 fee is charged if the withdrawal causes the balance to fall below
     * $100.
     * pre: none
     * post: The balance has been decreased by the amount withdrawn and a
     * charge has been assessed if the balance fell below $100.
     */
    public void withdrawal(double amt) {
      super.withdrawal(amt);
      if (getBalance() < 100) {
        super.withdrawal(2);
        System.out.println("A 2$ fee has been charged because the amount of money in the account is now less than 100$.");
      }
    }
  }
  