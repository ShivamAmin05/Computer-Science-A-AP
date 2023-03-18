
import java.util.Scanner;
class Attendence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many students are in the class");
    int numStudents = input.nextInt();
    String[] students = new String[numStudents];
    Scanner input2 = new Scanner(System.in);
    for(int i = 0; i < students.length; i ++)
    {
      System.out.println("What is the student's name");
      String name = input2.nextLine();
      students[i] = name;
    }

    System.out.println("Enter a student's name: ");
    String student = input2.nextLine();
    boolean studentPresent = false;
    for(int i =0; i < students.length; i++)
    {
      if(students[i].equals(student))
      {
        studentPresent = true;
      }
    }
    if(studentPresent)
    {
      System.out.println(student + " is present");
    }
    else
    {
      System.out.println(student + " is absent");
    }
  }
}