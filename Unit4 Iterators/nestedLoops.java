/*
* Example of nested for loops
* *** Observe the code and complete the steps below!***
*/

class nestedLoops {
    public static void main(String[] args) {
      System.out.println("Here is an example of Nested Loops: \n");
  
      // symbol to print:
      String symbol = "*";
      int numOfRows = 8;
      int numOfSymbol = 6;
      for (int y = 0; y < numOfRows; y++)// outer loop (handles the rows)
      {
        numOfSymbol--;
        for (int x = 0; x < numOfSymbol; x++)// inner loop (handles the number of things across)
        {
          System.out.print(symbol); // *note - using just a print, not println
        }
        System.out.println(); // moves to the next line
      }
    }
  }
  // complete the steps:
  // step 1 - run the program and observe: What happens?
  
  // step 2 - change numOfRows = 8, run program: What happens?
  
  // step 3 - change numOfSymbol = 6, run program: What happens?
  
  // step 4 - now on line 13, instead of declaring numOfSymbol, give it = 6 and on
  // line 16 change to numOfSymbol-- & run the program: What happens?
  
  // step 5 - go to the loop II assignment in Canvas, and begin