public class Empolyee {
  private String name;
  private String address;
  private int number;

  // 打工仔
  public Empolyee(String name, String address, int number) {
    this.name = name;
    this.address = address;
    this.number = number;
    System.out.println("Empolyee的构造函数");
  }

  public void mailCheck() {
    System.out.println("邮票寄给" + this.name + "这人家住在" + this.address);
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String newAddress) {
    this.address = newAddress;
  }

  public int getNumber() {
    return this.number;
  }
}
