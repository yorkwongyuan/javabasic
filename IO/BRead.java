import java.io.*;

public class BRead {
  public static void main(String[] args) throws IOException {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    do {
      c = (char) br.read();
      System.out.println(c);
    } while (c != 'q');
  }
}