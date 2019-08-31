import java.util.Scanner;

public class Scanners3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    double x = 0.0;
    while (scan.hasNextDouble()) {
      double m = scan.nextDouble();
      x = x + m;
      i++;
    }
    System.out.println(i + "个数字,平均数为:" + (x / i));
  }
}