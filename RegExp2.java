import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExp2 {
  public static void main(String[] args) {
    String str = "windows2000";
    // 如果括号内问号都没有，那么匹配windows2000,group(1)为2000
    Pattern p = Pattern.compile("windows(98|2000)");
    Pattern p1 = Pattern.compile("windows(?:98|2000)");
    Pattern p2 = Pattern.compile("windows(?=98|2000)");
    Matcher m = p.matcher(str);
    Matcher m1 = p1.matcher(str);
    Matcher m2 = p2.matcher(str);
    if (m.find()) {
      System.out.println(m.group(0));
      System.out.println(m.group(1));
    }
    if (m1.find()) {
      System.out.println(m1.group(0));
    }
    if (m2.find()) {
      System.out.println(m2.group(0)); // 只匹配前面
    }
  }
}