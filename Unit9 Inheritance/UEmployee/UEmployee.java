/**
 * UEmployee class.
 */
abstract class UEmployee {
    String empName;
    double salary;
  
    /**
     * constructor
     * pre: none
     * post: A university employee object has been created.
     */
    public UEmployee(String name, double sal) {
      empName = name;
      salary = sal;
    }
  
    /**
     * Returns the name of the employee
     * pre: none
     * post: The name of the employee has been returned.
     */
    public String getEmpName() {
      return empName;
    }
  
    /**
     * Returns the salary of the employee
     * pre: none
     * post: The salary of the employee has been returned.
     */
    public double getSalary() {
      return salary;
    }
  }
  