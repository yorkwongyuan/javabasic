import java.util.Dictionary;
import java.util.Vector;

public class AssocArray extends Dictionary {
  private Vector<E> keys = new Vector();
  private Vector values = new Vector();

  public int size() {
    return keys.size();
  }

  public boolean isEmpty() {
    return keys.isEmpty();
  }
}