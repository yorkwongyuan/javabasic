import java.io.Serializable;

public class Employee implements Serializable {
  public String name;
  public String address;
  public transient int SSN;
  public int number;

  public void mainCheck() {
    System.out.println(name + "" + address);
  }
}