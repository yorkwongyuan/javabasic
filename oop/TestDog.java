class Animal {
  public void move() {
    System.out.println("animal can move");
  }
}

class Dog extends Animal {
  public void move() {
    System.out.println("animal can run");
  }

  public void bark() {
    System.out.println("dog will bark you!");
  }
}

public class TestDog {
  public static void main(String args[]) {
    Animal a = new Animal();
    Animal b = new Dog();
    a.move();
    b.move();
    b.bark(); // 报错,因为该类型为Animal类型
  }
}