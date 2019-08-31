import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
  public static void main(String[] args) {
    String str = "I am irn man123, this is zoo";
    Pattern p = Pattern.compile("\\d+");
    Matcher m = p.matcher(str);

    Pattern p1 = Pattern.compile("iro*");
    Matcher m1 = p1.matcher(str);

    Pattern p2 = Pattern.compile("o+");
    Matcher m2 = p2.matcher(str);

    Pattern p3 = Pattern.compile("o{2}");
    Matcher m3 = p3.matcher(str);
    // 非贪心模式
    Pattern p4 = Pattern.compile("o+?");
    Matcher m4 = p4.matcher(str);

    String name = "york";

    // 加上?:之后则不匹配括号内的内容
    Pattern p5 = Pattern.compile("yor(?:k|g)");
    Matcher m5 = p5.matcher(name);
    if (m.find()) {
      System.out.println(m.group());
    }

    if (m1.find()) {
      System.out.println(m1.group(0));
    }

    if (m2.find()) {
      System.out.println(m2.group(0));
    }

    if (m3.find()) {
      System.out.println(m3.group(0));
    }

    if (m4.find()) {
      System.out.println(m4.group(0));
    }

    if (m5.find()) {
      System.out.println(m5.group(0));
      System.out.println(m5.group(1));
    }
  }
}