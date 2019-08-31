public class CommandLine {
  static class MyClass {
    public int i;

    // 构造方法
    public MyClass() {
      i = 10;
    }
  }

  public static void main(String args[]) {
    MyClass myclass = new MyClass();
    System.out.println(myclass.i);
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}