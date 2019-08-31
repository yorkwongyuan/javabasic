import java.util.Arrays;
import java.io.*;

public class Input2 {
  public static void main(String[] args) {
    int n = 0;
    int i = 0;
    try {
      FileInputStream fs = new FileInputStream("text.txt");
      byte[] b = new byte[2];

      while (n != -1) {
        n = fs.read(b);
        i++;
        System.out.println(Arrays.toString(b));
        System.out.println("次数" + i);
      }
    } catch (IOException e) {
      System.out.println("通讯错误");
    }

  }
}