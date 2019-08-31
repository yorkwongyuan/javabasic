public class Changes {
  public static void main(String[] args) {
    int n1 = 12;
    int n2 = 99;
    swap(n1, n2);
  }

  private static void swap(int num1, int num2) {
    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("\t\tAfter swapping n1 is" + num1 + "n2 is" + num2);
  }
}