import java.io.*;
import java.util.Arrays;

public class Input {
  public static void main(String args[]) throws FileNotFoundException {
    try {
      FileInputStream f = new FileInputStream("text.txt");
      int n = 0;
      // StringBuffer strb = new StringBuffer();
      byte[] b = new byte[2];
      int i = 0;
      while (n != -1) {
        n = f.read(b);
        System.out.println(Arrays.toString(b));
        System.out.println(n);
        // char c = (char) n;
        // strb.append(c);
        i++;
        System.out.println("次数" + i);
      }
      // System.out.println(strb);
    } catch (FileNotFoundException e) {
      System.out.println("没找到");
    } catch (IOException e) {
      System.out.println("读取异常");
    }
  }
}