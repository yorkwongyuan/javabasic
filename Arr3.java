import java.util.Arrays;

public class Arr3 {
  public static void main(String[] args) {
    int[] arr = new int[] { 3, 2, 5, 8, 1, 4 };

    // sort
    System.out.println("排序后");
    // printArr(arr);
    Arrays.sort(arr);
    System.out.println("排序后");
    // printArr(arr);

    // binarySearch
    int index = Arrays.binarySearch(arr, 8);
    System.out.println(index);

    // equals
    int[] arr2 = new int[] { 2, 1, 4, 3, 6, 5 };
    int[] arr3 = new int[] { 2, 1, 4, 3, 6, 5 };
    boolean bool = Arrays.equals(arr2, arr3); // true
    System.out.println(bool);
    // fill
    int val = 8;
    int[] arr4 = new int[8];
    Arrays.fill(arr4, val);
    // printArr(arr4);
    // System.out.println(a)
  }

  public static void printArr(int[] list) {
    for (int element : list) {
      System.out.println(element);
    }
  }
}