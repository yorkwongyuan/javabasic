import com.httpserver.two.*;

public class Servers {
  public static void main(String args[]) {
    new WebServer().startServer(8000);
  }
}