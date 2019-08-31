import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExp3 {
  public static void main(String[] args) {
    String str = "windows2008";
    Pattern p = Pattern.compile("windows(?!2008|1998)");
    Matcher m = p.matcher(str);
    if (m.find()) {
      System.out.println(m.group());
    }
  }
}