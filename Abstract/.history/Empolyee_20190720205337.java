public abstract class Empolyee {
  private String name;
  private String address;
  private int number;

  public Empolyee(String name, String address, int number) {
    System.out.println("构造函数");
    this.name = name;
    this.address = address;
    this.number = number;
  }
}