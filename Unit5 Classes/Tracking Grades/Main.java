
// ****************************************************************

//   Student.java

//

//   Define a student class that stores name, score on test 1, and

//   score on test 2.  Methods prompt for and read in grades,

//   compute the average, and return a string containing student’s info.

// ****************************************************************

import java.util.Scanner;

public class Student

{

  // declare instance data
  private String name;
  private int test1;
  private int test2;

  // -----------------------------------------------

  // constructor

  // -----------------------------------------------

  public Student(String studentName)

  {
    name = studentName;

  }

  // -----------------------------------------------

  // inputGrades: prompt for and read in student's grades for test1 and test2.

  // Use name in prompts, e.g., "Enter's Joe's score for test1".

  // -----------------------------------------------

  public void inputGrades()

  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter " + getName() + "'s grade for test1:");
    test1 = input.nextInt();
    System.out.println("Enter " + getName() + "'s grade for test2: ");
    test2 = input.nextInt();

  }

  // -----------------------------------------------

  // getAverage: compute and return the student's test average

  // -----------------------------------------------

  public int getAverage() {
    return (test1 + test2) / 2;
  }

  // -----------------------------------------------

  // getName: print the student's name

  // -----------------------------------------------

  public String getName() {
    return name;
  }

  // -----------------------------------------------

  // toString: print the student's name, test scores, and average test score

  // -----------------------------------------------

  public String toString() {
    return "Name: " + getName() + " Grade for Test 1: " + test1 + " Grade for Test 2: " + test2 + " Average Grade: "
        + getAverage();
  }

}