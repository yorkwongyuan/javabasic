abstract class SubClass {
  private double price;
  static int num; // 静态int默认值为0

  // abstract void sayHello(){
  // System.out.println("hello world");
  // // 错误: 抽象方法不能有主体
  // }

  abstract void sayHello();

  public static void main(String[] args) {
    int num = SubClass.num;
    System.out.println(num);
  }
}

public class Caravan extends SubClass {
  // 子类实现抽象方法
  void sayHello() {
    System.out.println("hello world");
  }

  public static void main(String[] args) {
    System.out.println("this is main in Caravan");
  }
}