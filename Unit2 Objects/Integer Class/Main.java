class Main {
  public static void main(String[] args)
  {
    int x = 1245;
    System.out.println(x + " in binary is " + Integer.toBinaryString(x));
    System.out.println(x + " in hex is " + Integer.toHexString(x));
    System.out.println(x + " in octal is " + Integer.toOctalString(x));

    System.out.println(" The max value of an int is " + Integer.MAX_VALUE);
    System.out.println(" The min value of an int is " + Integer.MIN_VALUE);

    String one = "1";
    String ten = "10";
    int sum = Integer.parseInt(one) + Integer.parseInt(ten);
    System.out.println("The sum of " + one + " and " + ten + " is " + sum);

  }
}