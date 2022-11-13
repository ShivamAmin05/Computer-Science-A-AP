//Name - Shivam Amin
//Date - 10/10/22
//Class - CS A
//Lab  - Heron

import java.util.Scanner; 
import java.lang.Math.*;
public class Triangle
{
private int sideA, sideB, sideC;
private double perimeter;
private double theArea;
public Triangle()
{
   setSides(0,0,0);
   perimeter=0;
   theArea=0;
}
public Triangle(int a, int b, int c)
{
  setSides(a, b, c);
}
public void setSides(int a, int b, int c)
{
  sideA = a;
  sideB = b;
  sideC = c;
}
public void calcPerimeter( )
{
  perimeter = sideA+sideB+sideC;
}
public void calcArea( )
{
double s = perimeter/2.0;
theArea = Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC));
}
public void print( )
{
System.out.println("\n\n" + sideA + " " + sideB + " " + sideC + "\n");
System.out.printf("Area == " + "%.3f\n" + "\n",theArea);
}
//create a print method or toString or both
public String toString()
{
return "";
}
}
