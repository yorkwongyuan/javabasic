public class Test {
  public static void main(String args[]) {
    show(new Cat());
    show(new Dog());
    Animal a = new Cat();
    a.eat();
    Cat c = (Cat) a;
  }

  public static void show(Animal a) {
    a.eat();
    if (a instanceof Cat) {
      Cat c = new Cat();
      c.work();
    } else if (a instanceof Dog) {
      Dog c = new Dog();
      c.work();
    }
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

class Dog extends Animal {
  public void eat() {
    System.out.println("吃骨头");
  }

  public void wrok() {
    System.out.println("看家");
  }
}