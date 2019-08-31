import java.util.Vector;

public class VectorDemo2 {
  public static void main(String args[]) {
    Vector<String> m = new <String>Vector();
    m.add("This");
    m.add("is");
    m.add("spart");
    System.out.println(m);

    Iterator<String> it = m.iterator();
    if (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}