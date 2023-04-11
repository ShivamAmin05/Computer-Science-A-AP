import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, };
    int[] numsTwo = { 1, 2, 3, 4, 5, };
    System.out.println("The original array is: ");
    System.out.println(Arrays.toString(nums));

    Sorts listSorts = new Sorts();

    listSorts.selectionSort(nums);
    System.out.println("the array after running descending selction sort is:");
    System.out.println(Arrays.toString(nums));

    listSorts.insertionSort(numsTwo);
    System.out.println("the array after running descending insertion sort is:");
    System.out.println(Arrays.toString(nums));

  }
}
