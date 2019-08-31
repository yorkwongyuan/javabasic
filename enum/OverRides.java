public class OverRides {
  public enum Color {
    RED("red", 0), GREEN("green", 1), BLUE("blue", 2);
    private int index = 0;
    private String name = "";

    private Color(String name, int index) {
      this.name = name;
      this.index = index;
    }

    public String toString() {
      return this.name + "-" + this.index;
    }
  }

  public static void main(String args[]) {
    System.out.println(Color.RED.toString());
  }
}