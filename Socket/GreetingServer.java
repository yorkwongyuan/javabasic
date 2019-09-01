import java.net.*;
import java.io.*;

public class GreetingServer extends Thread {
  private ServerSocket serversocket;

  public GreetingServer(int port) throws IOException {
    serversocket = new ServerSocket(port);
    serversocket.setSoTimeout(100000000);
  }

  public void run() {
    while (true) {
      try {
        System.out.println("waitting for the port" + serversocket.getLocalPort());
        Socket server = serversocket.accept();
        System.out.println("just connect to" + server.getRemoteSocketAddress());
        DataInputStream in = new DataInputStream(server.getInputStream());
        System.out.println(in.readUTF());

        DataOutputStream out = new DataOutputStream(server.getOutputStream());
        out.writeUTF("Thank you for your connect to" + server.getLocalAddress());

        server.close();

      } catch (SocketTimeoutException timeout) {
        System.out.println("socket time out");
        break;
      } catch (IOException e) {
        e.printStackTrace();
        break;
      }
    }
  }

  public static void main(String args[]) {
    int port = Integer.parseInt(args[0]);
    try {
      Thread s = new GreetingServer(port);
      s.start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}