import java.io.*;

public class CheckingAcount {
  private double balance;
  private int number;

  public CheckingAcount(int number) {
    this.number = number;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) throws MyException {
    if (amount <= balance) {
      balance -= amount;
    } else {
      double need = amount - balance;
      throw new MyException(need);
    }
  }

  public double getBalance() {
    return balance;
  }

  public int getNumber() {
    return number;
  }
}