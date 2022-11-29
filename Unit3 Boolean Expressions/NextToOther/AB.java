//Name - Shivam Amin
public class AB {
  public static boolean check(String s, String a, String b) {
    for(int i = 2; i < s.length()-2;i++)
      {
        if(s.charAt(i) == a.charAt(0) && s.charAt(i-1) == b.charAt(0) || (s.charAt(i) == a.charAt(0) && s.charAt(i+1) == b.charAt(0)))
        {
          return true;
        }
      }
    return false;
  }
}