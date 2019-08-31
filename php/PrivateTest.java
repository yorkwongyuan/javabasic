import pkg.Privates;

public class PrivateTest {
  public static void main(String[] args) {
    Privates privates = new Privates();

    privates.setFormat("东赵大权限");
    String s = privates.getFormat();
    // System.out.println(s);
    System.out.println(privates.format);
    System.out.println(privates.age);
  }
}