public class VaragrsDemo {
  public static void main(String args[]) {
    printMax(12.56, 23, 5, 5.67);
    printMax(1, 2, 3);
  }

  public static void printMax(double... numbers) {
    if (numbers.length == 0) {
      return;
    }

    double result = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > result) {
        result = numbers[i];
      }
    }
    System.out.println(result);
  }
}