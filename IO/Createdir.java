import java.io.File;

public class Createdir {
  public static void main(String args[]) {
    String dirname = "./文件夹/哈局";
    File f = new File(dirname);
    f.mkdirs();
  }
}