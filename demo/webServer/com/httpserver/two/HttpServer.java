package com.httpserver.two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @description: 使用socket 实现 web服务器 --- 具体执行读写操作的。
 * @version:v1.0
 * @author:w
 * @date：2018年6月6日上午11:06:20
 *
 */
public class HttpServer extends Thread {
  /**
   * web资源根路径
   */
  public static final String ROOT = "/Applications/york/java/demo/webServer/static";

  /**
   * 输入流对象,读取浏览器请求
   */
  private InputStream input;

  /**
   * 输出流对象，响应内容给浏览器
   */
  private OutputStream out;

  /**
   * @description:初始化socket对象,获取对应 输入，输出流
   * @param socket1
   */
  public HttpServer(Socket socket) {
    try {
      input = socket.getInputStream();
      out = socket.getOutputStream();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * 多线程方法调用
   */
  @Override
  public void run() {
    String filePath = read();
    response(filePath);
  }

  /**
   * @description: 读取资源文件，响应给浏览器。
   * @param:@param filePath 资源文件路径
   * @return:void
   * @version:v1.0
   * @author:w
   * @date:2018年6月6日 上午11:42:37
   *
   */
  private void response(String filePath) {
    File file = new File(ROOT + filePath).getAbsoluteFile();
    if (file.exists()) {
      System.out.println(file + "file");
      // 1、资源存在，读取资源
      try {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while ((line = reader.readLine()) != null) {
          sb.append(line).append("\r\n");
        }
        StringBuffer result = new StringBuffer();
        result.append("HTTP /1.1 200 ok /r/n");
        result.append("Content-Type:text/html /r/n");
        result.append("Content-Length:" + file.length() + "/r/n");
        result.append("\r\n:" + sb.toString());
        out.write(result.toString().getBytes());
        out.flush();
        out.close();
      } catch (Exception e) {
        System.out.println("异常");
        e.printStackTrace();
      }

    } else {
      // 2、资源不存在，提示 file not found
      StringBuffer error = new StringBuffer();
      error.append("HTTP /1.1 400 file not found /r/n");
      error.append("Content-Type:text/html \r\n");
      error.append("Content-Length:20 \r\n").append("\r\n");
      error.append("<h1 >File Not Found..</h1>");
      try {
        out.write(error.toString().getBytes());
        out.flush();
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  /**
   * 
   * @description:解析资源文件路径
   * @example: GET /index.html HTTP/1.1
   * @param:@return
   * @return:String
   * @version:v1.0
   * @author:w
   * @date:2018年6月6日 上午11:39:42
   *
   */
  private String read() {
    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
    try {
      // 读取请求头， 如：GET /index.html HTTP/1.1
      String readLine = reader.readLine();
      String[] split = readLine.split(" ");
      if (split.length != 3) {
        return null;
      }
      System.out.println(readLine);
      return split[1];
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

}