public class String2 {
  public static void main(String[] args) {
    char[] arr = new char[] { '1', '3', '7', '0', '8', '3' };
    String str = "";
    str = str.valueOf(arr);
    System.out.println(str);
    String str2 = "";
    str2 = str2.copyValueOf(arr);
    System.out.println(str2 instanceof String);
  }
}