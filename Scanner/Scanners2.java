import java.util.Scanner;

public class Scanners2 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // if (scan.hasNextLine()) {
    // String str = scan.nextLine();
    // System.out.println(str);
    // }
    System.out.print("请输入数字");
    if (scan.hasNextInt()) {
      int num = scan.nextInt();
      System.out.println("输入的数字为:" + num);
    } else {
      System.out.println("输入的不是数字");
    }

    System.out.print("请输入浮点数");
    if (scan.hasNextFloat()) {
      float f = scan.nextFloat();
      System.out.println("输入的浮点数为:" + f);
    } else {
      System.out.println("输入的不是浮点树");
    }
  }
}