package pkg;

public class Privates {
  public String format = "this";
  protected int age = 19;
  private static String gender = "male";

  public String getFormat() {
    return format;
  }

  public void setFormat(String name) {
    format = name;
  }

}