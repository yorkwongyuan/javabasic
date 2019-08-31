public class StaticVar {
  private static double salary;
  public static final String DEVELOPMENT = "开发人员";

  public static void main(String[] args) {
    salary = 10000000;
    System.out.println(DEVELOPMENT + "的工资一般是" + salary);
  }
}