public class Salary extends Empolyee {
  private double salary;

  public Salary(String name, String address, int number, double salary) {
    super(name, address, number);
    setSalary(salary);
  }

  public void setSalary(double newsalary) {
    salary = newsalary;
  }
}