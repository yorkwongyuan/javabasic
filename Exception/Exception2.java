import java.io.*;

public class Exception2 {
  public static void main(String args[]) {
    try {
      int a = 12;

    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }
  }

  public static void test(String args) {
    System.out.println(args);
  }
}
