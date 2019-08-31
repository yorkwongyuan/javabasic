public class Testenum1 {
  enum Sign {
    GREEN, RED, YELLOW
  }

  public static void main(String args[]) {
    for (int i = 0; i < Sign.values().length; i++) {
      System.out.println("索引为" + Sign.values()[i].ordinal() + "的值是" + Sign.values()[i]);
    }
  }
}