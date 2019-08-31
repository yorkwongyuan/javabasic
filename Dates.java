import java.util.*;
import java.text.*;

public class Dates {
  public static void main(String[] args) {
    Date date = new Date();
    // System.out.println(date.toString());
    System.out.println(date.getTime());

    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat ft2 = new SimpleDateFormat("yy-MM-dd");
    System.out.println("Current Date: " + ft.format(dNow));
    System.out.println("Current Date: " + ft2.format(dNow));
  }
}
