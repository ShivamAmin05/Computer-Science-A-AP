class Shortfall {
  public static void main(String[] args) {
    short value = 32767;
    System.out.println("A short: " + value);
  }
}

/*
 * Question 1: Next change the number to 35000 and try to compile and run the
 * program. This number is too large to work with the data type short (in other
 * words, it cannot be represented in 16 bits using data type short.) What
 * happens?
 * 
 * The file does not run
 * 
 * Questions 2: Now edit the program (leave the value at 35000) but change the
 * data type to int. Compile and run the program. Is there a difference? What is
 * the largest value allowed for a data type short ?
 * 
 * The program runs, the largest value that is allowed by short is 32767
 * 
 */