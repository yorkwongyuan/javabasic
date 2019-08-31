import java.io.File;

public class DirList {
  public static void main(String args[]) {
    String dirname = "./";
    File f = new File(dirname);
    if (f.isDirectory()) {
      String[] s = f.list();
      for (int i = 0; i < s.length; i++) {
        File f2 = new File(dirname + '/' + s[i]);
        if (f2.isDirectory()) {
          System.out.println("文件夹" + s[i]);
        } else {
          System.out.println("文件" + s[i]);
        }
      }
    }
  }
}