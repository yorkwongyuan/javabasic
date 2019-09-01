public class GenericMethodTest {
  public static <E> void printArray(E[] inputArray) {
    for (E element : inputArray) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 1.2, 1.3 };
    printArray(intArray);
    printArray(doubleArray);
  }
}