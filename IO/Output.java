import java.io.*;

public class Output {
  public static void main(String args[]) {
    try {
      FileOutputStream os = new FileOutputStream("test.txt");
      byte bWrite[] = { 121 };
      for (int i = 0; i < bWrite.length; i++) {
        os.write(bWrite[i]);
      }
      os.close();

      FileInputStream fs = new FileInputStream("test.txt");
      char c;
      int size = fs.available();
      for (int j = 0; j < size; j++) {
        c = (char) fs.read();
        System.out.println(c);
      }
      fs.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}