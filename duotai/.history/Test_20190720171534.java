public class Test {
  public static void main(String args[]) {

  }
}

abstract class Animal {
  abstract void eat();
}

class Cat extends Animal {
  public void eat() {
    System.out.println("吃鱼");
  }

  public void wrok() {
    System.out.println("抓老鼠");
  }
}