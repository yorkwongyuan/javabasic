public class Arr2 {
  public static void main(String args[]) {
    double[] myList = { 1.9, 2.1, 8.1 };

    // 打印所有数组元素
    for (int i = 0; i < myList.length; i++) {
      System.out.println(myList[i]);
    }

    // 计算所有元素和
    int total = 0;

    for (int i = 0; i < myList.length; i++) {
      total += myList[i];
    }

    System.out.println("总数为:" + total);

    double max = 0;
    // 求出最大的
    for (int i = 0; i < myList.length; i++) {
      if (myList[i] > max)
        max = myList[i];
    }
    System.out.println("最大的数为:" + max);

    // foreach循环
    for (double item : myList) {
      System.out.println(item);
    }
    // 作为参数
    // printArray(new int[] { 1, 3, 6, 7, 8, 4 });

    reverse(new int[] { 1, 2, 3, 4, 5, 6 });
  }

  // 打印所有数组元素
  private static void printArray(int array[]) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  // 倒序
  public static int[] reverse(int[] lists) {
    int[] result = new int[lists.length];
    for (int i = 0, j = lists.length - 1; i < lists.length; i++, j--) {
      result[i] = lists[j];
    }
    printArray(result);
    return result;
  }
}