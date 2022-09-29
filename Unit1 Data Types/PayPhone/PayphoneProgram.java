import java.util.Random;

class PayphoneProgram {
  public static void main(String[] args) {

    Random generator = new Random();
    int firstNums = generator.nextInt(700) + 100;
    while (firstNums % 10 >= 8 || firstNums % 100 >= 80) {
      firstNums = generator.nextInt(700) + 100;
    }
    int secondNums = generator.nextInt(643) + 100;

    int thirdNums = generator.nextInt(10000) + 1000;

    System.out.print("Random Phone number: " + firstNums + "-" + secondNums + "-" + thirdNums);
  }
}