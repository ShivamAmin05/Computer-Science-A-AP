//Name - Shivam Amin
//Date - 10/10/22
//Lab  - EndsWith
import static java.lang.System.*; 
import java.util.Scanner;
public class Main
{
public static void main ( String[] args )
{
System.out.println( StringUtilities.endsWith("chicken", "en"));
System.out.println( StringUtilities.endsWith("chicken", "dog"));
System.out.println( StringUtilities.endsWith("alligator", "gator"));
System.out.println( StringUtilities.endsWith("alligator", "all"));
System.out.println( StringUtilities.endsWith("apluscompsci", "sci"));
System.out.println( StringUtilities.endsWith("apluscompsci", "comp"));
//test cases
/*chicken en
chicken dog
alligator gator
alligator all
apluscompsci sci */
//output
/*true
false
true
false
true
false*/
}
}
