public class OverRides2 {
  enum Color {
    GREEN("绿色", 1), RED("红色", 2), YELLOW("黄色", 3);
    private String str;
    private int index;

    private Color(String str, int index) {
      this.str = str;
      this.index = index;
    }

    public String toString() {
      System.out.println(this.str + "==>" + this.index);
      return this.str + this.index;
    }
  }

  public static void main(String args[]) {
    String result = Color.RED.toString();
    System.out.println(result);
  }
}