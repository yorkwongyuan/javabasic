import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExMatches {
  // private static final String REGEX = "\\bcat\\b";
  private static final String REGEX2 = "cat(?=e)";
  private static final String INPUT = "cat cat cat cateie cat";

  public static void main(String[] args) {
    Pattern p = Pattern.compile(REGEX2);
    Matcher m = p.matcher(INPUT);

    int count = 0;
    while (m.find()) {
      count++;
      System.out.println("matches number is" + count);
      System.out.println("start is" + m.start());
      System.out.println("end is" + m.end());
    }
  }
}