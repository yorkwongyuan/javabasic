public class BankDemo {
  public static void main(String args[]) {
    CheckingAcount c = new CheckingAcount(500);
    // System.out.println("depositing 500$");
    c.deposit(500);
    c.deposit(400);
    try {
      c.withdraw(600);
    } catch (MyException e) {
      System.out.println("你个狗屎人,你没钱" + e.getAmount());
    }
  }
}