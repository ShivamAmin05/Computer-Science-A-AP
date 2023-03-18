import java.util.Scanner;
class OddNums {
  public static void main(String[] args) {
    int[] nums = new int[8];
    int[] oddNums = new int[8];
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < nums.length; i++)
    {
      System.out.println("Enter a num:");
      int num = input.nextInt();
      nums[i] = num; 
    }
    int start = 0;
    int end = nums.length - 1;
    for(int s: nums)
    {
      if(s % 2 == 1)
      {
        oddNums[start] = s;
        start++;
      }
      else
      {
        oddNums[end] = s;
        end--;
      }
    }
    System.out.println("Odd nums list ");
    for(int n: oddNums)
    {
     System.out.print(n + " "); 
    }
  }
}