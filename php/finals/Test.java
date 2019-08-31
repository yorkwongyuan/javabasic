package finals;

public class Test {
  static final int value = 10;
  public static final int BOXWIDTH = 100;

  final static public String TITLE = "Manager";

  static void getTest() {
    System.out.println(value);
  }

  public static void main(String[] args) {
    // value = 123; 报错
    System.out.println(value);
    Test.getTest();
  }
}