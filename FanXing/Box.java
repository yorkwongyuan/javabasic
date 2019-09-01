public class Box<T> {
  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public static void main(String args[]) {
    Box<Integer> boxnum = new Box<Integer>();
    Box<String> boxstring = new Box<String>();
    boxnum.add(new Integer(123));
    boxstring.add(new String("york"));
    System.out.printf("整属性%d\n", boxnum.get());
    System.out.printf("字符串%s\n", boxstring.get());
  }
}