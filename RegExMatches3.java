import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExMatches3 {
  private static String INPUT = "cat say that cat is like miao";
  private static String REPLACE = "dog";

  public static void main(String[] args) {
    Pattern p = Pattern.compile("cat");
    Matcher m = p.matcher(INPUT);
    if (m.find()) {
      INPUT = m.replaceAll(REPLACE);
      System.out.println(INPUT);
    }
  }
}