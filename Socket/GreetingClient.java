import java.io.*;
import java.net.*;

// 客户端
public class GreetingClient {
  public static void main(String args[]) {
    String serverName = args[0];
    int port = Integer.parseInt(args[1]);
    try {
      System.out.println("connect to" + serverName + "on port" + port);
      Socket client = new Socket(serverName, port);
      System.out.println("just connect to socket" + client.getRemoteSocketAddress());
      OutputStream toServer = client.getOutputStream();
      DataOutputStream out = new DataOutputStream(toServer);
      out.writeUTF("hello this is from" + client.getLocalSocketAddress());

      InputStream inFromServer = client.getInputStream();
      DataInputStream in = new DataInputStream(inFromServer);
      System.out.println("server said" + in.readUTF());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}