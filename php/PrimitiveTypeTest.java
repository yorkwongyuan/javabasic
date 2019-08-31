public class PrimitiveTypeTest {
  public static void main(String[] args) {
    System.out.println("基本类型: byte二进制位数: " + Byte.SIZE);
    System.out.println("包装类:java.lang.Byte");
    System.out.println("最大值" + Byte.MAX_VALUE);
    System.out.println("最小值" + Byte.MIN_VALUE);
    System.out.println("基本类型: short二进制位数: " + Short.SIZE);
    System.out.println("基本类型: int二进制位数: " + Integer.SIZE);
    System.out.println("基本类型: long二进制位数: " + Long.SIZE);
    System.out.println("基本类型: float二进制位数: " + Float.SIZE);
    System.out.println("基本类型: double: " + Double.SIZE);
    System.out.println("基本类型: char二进制位数: " + Character.SIZE);
    System.out.println("基本类型: char最大值: " + (int) Character.MAX_VALUE);
    System.out.println("基本类型: char最小值: " + (int) Character.MIN_VALUE);

    char name = 'y';
    String longName = "神经家康公";
    System.out.println(longName);
  }
}