
/**
* Staff class.
*/
import java.text.NumberFormat;

class Staff extends UEmployee {
  String title;

  /**
   * constructor
   * pre: none
   * post: A university staff employee object has been created.
   */
  public Staff(String name, double sal, String jobTitle) {
    super(name, sal);
    title = jobTitle;
  }

  /**
   * Returns the employee's job title
   * pre: none
   * post: The employee's job title has been returned.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Returns the employee name, salary, and title
   * pre: none
   * post: The name, salary, and title of the employee has been returned.
   */
  public String toString() {
    String empInfo;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    empInfo = super.getEmpName() + " " + title + " " +
        money.format(super.getSalary());
    return (empInfo);
  }
}