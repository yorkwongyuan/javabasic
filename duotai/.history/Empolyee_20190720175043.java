public class Empolyee {
  private String name;
  private String address;
  private int number;

  public Empolyee(String name, String address, int number) {
    this.name = name;
    this.address = address;
    this.number = number;
    System.out.println("Empolyee的构造函数");
  }
}