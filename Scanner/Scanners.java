import java.util.Scanner;

public class Scanners {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNext()) {
      String str = scanner.next();
      System.out.println(str);
    }
  }
}