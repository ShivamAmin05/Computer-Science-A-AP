import java.util.*;
class ZeroToFifty {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers in the range of 0 to 50");
    List<Integer> nums = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter a number:");
      int num = input.nextInt();
      while(num < 0 || num > 50)
      {
        System.out.println("The range of the number has to be from 0 - 50. Enter a new number:");
        num = input.nextInt();
      }
      nums.add(num);
    }
    List<Integer> uniqueNums = new ArrayList<Integer>(new HashSet<Integer>(nums));
    System.out.println("The nums in the list are: ");
    System.out.println(nums);

    for (int n : uniqueNums) {
      int numAppearances = Collections.frequency(nums, n);
      System.out.println(n + " appears " + numAppearances + " times.");
    }
  }
}