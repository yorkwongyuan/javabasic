import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExMatches2 {
  private static final String REGEX = "foo";
  private static final String INPUT = "foooooo";
  private static Pattern pattern;
  private static Matcher matcher;

  public static void main(String[] args) {
    pattern = Pattern.compile(REGEX);
    matcher = pattern.matcher(INPUT);
    System.out.println(matcher.lookingAt());
    System.out.println(matcher.matches());
  }
}