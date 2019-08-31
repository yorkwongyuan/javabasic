// import java.io.*;

public class EmpolyeeTest {
  public static void main(String[] args) {
    Empolyee empolyee = new Empolyee("york");
    System.out.println(empolyee.name);
    empolyee.emAge(12);
    empolyee.emDesignation("史达林");
    empolyee.emSalary(2000);
    empolyee.print();
  }
}