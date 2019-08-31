import java.io.*;

public class Output2 {
  public static void main(String args[]) {
    try {
      File f = new File("zha.txt");
      FileOutputStream fop = new FileOutputStream(f);
      OutputStreamWriter writer = new OutputStreamWriter(fop, "utf-8");
      writer.append("这是什么");
      writer.close();
      fop.close();

      FileInputStream fps = new FileInputStream(f);
      InputStreamReader reader = new InputStreamReader(fps, "utf-8");
      StringBuffer sb = new StringBuffer();
      while (reader.ready()) {
        sb.append((char) reader.read());
      }
      System.out.println(sb);
      fps.close();
      reader.close();
    } catch (FileNotFoundException e) {

    } catch (IOException e) {

    }

  }
}