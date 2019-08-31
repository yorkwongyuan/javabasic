public class Strings {
  public static void main(String[] args) {
    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.', 'w', 'o', 'r', 'l', 'd' };
    String helloString = new String(helloArray);
    System.out.println(helloString);
    String site = "www.baidu.com";
    int len = site.length();
    System.out.println(len);

    String str1 = "hello";
    String str2 = "world";
    System.out.println(str1.concat(str2));

    float floatVar = 3.1f;
    int intVar = 8;
    String stringVar = "world";
    System.out.format("浮点型变量的的值为 " + "%f, 整型变量的值为 " + " %d, 字符串变量的值为 " + "%s\n", floatVar, intVar, stringVar);
    System.out.printf("浮点型为%f,整型为%d,字符串为%s\n", floatVar, intVar, stringVar);

    // String 类的方法
    String str = "york";
    // String res = str.charAt(0); // char无法转换为String
    char res = str.charAt(0);
    System.out.println(res);

    Integer inte = 4;
    System.out.println(inte.compareTo(1)); // 大于1,小于-1,等于0;

    String a = "io";
    String b = "i";

    System.out.println(Integer.valueOf('o')); // 97
    System.out.println(b.compareTo(a));

    String b1 = "hehe";
    String b2 = "hehe";

    System.out.println(b1.contentEquals(b2)); // true
  }
}