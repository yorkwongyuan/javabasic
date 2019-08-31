public class Signal {
  public enum S {
    GREEN, RED, YELLOW
  }

  public static void main(String args[]) {
    S ss = S.valueOf("GREEN");
    compare(ss);
  }

  public static void compare(S s) {
    for (int i = 0; i < S.values().length; i++) {
      System.out.println(s + "与" + S.values()[i] + "的比较结果是" + s.compareTo(S.values()[i]));
    }
  }
}