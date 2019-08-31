public class Finalize {
  public static void main(String args[]) {
    Cake c1 = new Cake(1);
    Cake c2 = new Cake(2);
    Cake c3 = new Cake(3);
    c1 = c2 = null;
    // 调用垃圾收集器
    System.gc();
  }
}

class Cake extends Object {
  private int id;

  public Cake(int id) {
    this.id = id;
    System.out.println("Cake id is" + this.id + ",is created");
  }

  protected void finalize() throws java.lang.Throwable {
    super.finalize();
    System.out.println("the cake id is " + id + ",is disposed");
  }
}