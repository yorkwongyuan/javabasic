public class Arr1 {
  public static void main(String args[]) {
    String[] ArrStr = { "york", "nigel", "naresh" };
    System.out.println(ArrStr);

    int size = 10;
    double total = 0;
    double[] myList = new double[size];
    myList[0] = 1.2;
    myList[1] = 1.4;
    myList[2] = 1.8;
    for (int i = 0; i < size; i++) {
      total += myList[i];
    }

    System.out.println(total);
  }
}