public class Main

{

  public static void main(String[] args)

  {

    manageAccount acct1, acct2;

    // create account1 for Sally with $1000

    acct1 = new manageAccount(1000.0, "Sally", 1111l);

    // create account2 for Joe with $500
    acct2 = new manageAccount(500.0, "Joe", 1112l);

    // deposit $100 to Joe's account
    System.out.println(acct2.getName() + "deposited" + acct2.getBalance());
    acct2.deposit(100.0);
    // print Joe's new balance (use getBalance())
    System.out.println(acct2.getName() + "'s balance is " + acct2.getBalance());
    // withdraw $50 from Sally's account
    acct1.withdraw(50);
    // print Sally's new balance (use getBalance())
    System.out.println(acct1.getName() + "'s balance is " + acct1.getBalance());
    // charge fees to both accounts
    System.out.println("The charge fee is $5.00");
    System.out.println(acct1.getName() + "'s balance is " + acct1.chargeFee());
    System.out.println(acct2.getName() + "'s balance is " + acct1.chargeFee());
    acct2.chargeFee();
    // change the name on Joe's account to Joseph
    acct2.changeName("Joseph");
    // print summary for both accounts
    System.out.println(acct1);
    System.out.println(acct2);
    
  }

}
