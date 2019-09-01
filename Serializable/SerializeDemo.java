import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
  public static void main(String[] args) {
    Employee e = new Employee();
    e.name = "york";
    e.address = "sr";
    e.number = 12;
    e.SSN = 44;

    try {
      FileOutputStream fileoutput = new FileOutputStream("./employee.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileoutput);
      out.writeObject(e);
      out.close();
      fileoutput.close();
      System.out.print("ok");
    } catch (IOException error) {
      error.printStackTrace();
    }
  }
}