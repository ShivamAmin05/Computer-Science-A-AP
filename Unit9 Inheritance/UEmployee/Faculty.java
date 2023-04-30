
/**
* Faculty class.
*/
import java.text.NumberFormat;

class Faculty extends UEmployee {
  String dept;

  /**
   * constructor
   * pre: none
   * post: A university faculty employee object has been created.
   */
  public Faculty(String name, double sal, String department) {
    super(name,sal);
    dept = department;
  }

  /**
   * Returns the department the employee works in
   * pre: none
   * post: The employee's department has been returned.
   */
  public String getDept() {
    return dept;
  }

  /**
   * Returns the employee name, salary, and dept
   * pre: none
   * post: The name, salary, and dept of the employee has been returned.
   */
  public String toString() {
    String empInfo;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    empInfo = super.getEmpName() + " " + dept + " " +
        money.format(super.getSalary());
    return (empInfo);
  }
}
