import java.io.*;

public class MyException extends Exception {
  private double amount;

  public MyException(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }
}