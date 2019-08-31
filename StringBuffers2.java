public class StringBuffers2 {
  public static void main(String[] args) {
    StringBuffer stringbuffer = new StringBuffer("york");
    // int index = stringbuffer.lastIndexOf("k");
    stringbuffer.setCharAt(1, 'b');
    System.out.println(stringbuffer);
    CharSequence charsequence = stringbuffer.subSequence(0, 1);
    System.out.println(charsequence);
  }
}