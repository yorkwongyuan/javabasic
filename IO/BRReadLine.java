import java.io.*;

public class BRReadLine {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String strs;
    do {
      strs = br.readLine();
      System.out.println(strs);
    } while (!strs.equals("end"));
  }
}