import java.util.Scanner;
class StudentRoster {
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

    System.out.println("The students in the class are ");
    for(String s : students)
    {
      System.out.print(s + ", ");
    }
  }
}