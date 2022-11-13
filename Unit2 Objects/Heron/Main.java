//Name - Shivam Amin
//Date - 10/10/22
//Class - CS A
//Lab  - Heron

import java.util.Scanner; 
import java.lang.Math.*;
public class Main  //this class is used to test Triangle
{
public static void main( String[] args )
{
Scanner keyboard = new Scanner(System.in);
//ask for user input
System.out.print("Enter side A ::  ");
int a = keyboard.nextInt();
System.out.print("Enter side B ::  ");
int b = keyboard.nextInt();
System.out.print("Enter side C ::  ");
int c = keyboard.nextInt();
Triangle test = new Triangle(a, b, c);
test.calcPerimeter();
test.calcArea();
test.print();
//ask for user input
System.out.print("Enter side A ::  ");
a = keyboard.nextInt();
System.out.print("Enter side B ::  ");
b = keyboard.nextInt();
System.out.print("Enter side C ::  ");
c = keyboard.nextInt();
test.setSides(a,b,c);
test.calcPerimeter();
test.calcArea();
test.print();
//add one more input section
System.out.print("Enter side A ::  ");
a = keyboard.nextInt();
System.out.print("Enter side B ::  ");
b = keyboard.nextInt();
System.out.print("Enter side C ::  ");
c = keyboard.nextInt();
test.setSides(a,b,c);
test.calcPerimeter();
test.calcArea();
test.print();
}
}
