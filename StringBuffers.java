public class StringBuffers {
  public static void main(String[] args) {
    StringBuffer stringbuffer = new StringBuffer("hello");
    stringbuffer.append(" world");
    // stringbuffer.reverse(); // 反转
    // stringbuffer.delete(1, 2); // 不包含结尾
    // stringbuffer.insert(1, "shit");
    // stringbuffer.replace(0, 5, "fuck"); // fuck world
    // char c = stringbuffer.charAt(0);
    // stringbuffer.ensureCapacity(9999); // 设置容量
    // int len = stringbuffer.capacity();
    // char[] str = new char[6];
    // stringbuffer.getChars(0, 6, str, 0); // 复制一个
    System.out.println(stringbuffer);
  }
}