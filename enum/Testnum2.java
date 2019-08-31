public class Testnum2 {
  enum sign {
    YORK, NIGEL, ROBIN
  }

  public static void main(String args[]) {
    for (int i = 0; i < sign.values().length; i++) {
      System.out.println(sign.values()[i].ordinal() + "==>" + sign.values()[i]);
    }
  }
}