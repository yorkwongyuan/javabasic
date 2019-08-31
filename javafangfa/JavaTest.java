public class JavaTest {
  public static int max(int num1, int num2) {
    int result;
    if (num1 > num2) {
      result = num1;
    } else {
      result = num2;
    }
    return result;
  }

  // 方法重载
  public static double max(double num1, double num2) {
    double result;
    if (num1 > num2) {
      result = num1;
    } else {
      result = num2;
    }
    return result;
  }

  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    int k = max(i, j);
    System.out.println(k);

    double l = 3.23;
    double m = 4.132;
    double n = max(l, m);
    System.out.println(n);
  }
}