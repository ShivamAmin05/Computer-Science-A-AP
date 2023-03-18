class Reverse {
    public static void main(String[] args) {
      int[] reverse =new int[10];
  
      for(int i = 0; i < reverse.length; i++)
      {
        reverse[i] = i;
      }
  
      System.out.println("Countdown");
      for(int i = reverse.length - 1; i >= 0; i--)
      {
         System.out.println(reverse[i]); 
      }
    }
  }