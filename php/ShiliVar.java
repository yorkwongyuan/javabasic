public class ShiliVar {
  private double salary;

  public ShiliVar(String empName) {
    name = empName;
  }

  public String name;

  public void setSalary(double empSala) {
    salary = empSala;
  }

  public void print() {
    System.out.println("名字:" + name + "," + "成绩:" + salary);
  }

  public static void main(String[] args) {
    ShiliVar shilivar = new ShiliVar("york");
    shilivar.setSalary(29.9);
    shilivar.print();
    System.out.println(shilivar.name); // 不可以直接用name来访问
  }
}