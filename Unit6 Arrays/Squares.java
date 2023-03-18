class Squares {
    public static void main(String[] args) {
      int[] squares = new int[5];
      for(int i = 0; i < squares.length; i ++)
      {
        squares[i] = (int)Math.pow(i,2);
      }
  
      System.out.println("The squares of the numbers from 0-4 are");
      for(int s: squares)
      {
        System.out.print(s + " ");
      }
    }
  }