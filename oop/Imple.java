interface Animal {
}

class Mammal implements Animal {
}

public class Imple extends Mammal {
  public static void main(String args[]) {
    Mammal m = new Mammal();
    Imple son = new Imple();
    System.out.println(m instanceof Animal);
    System.out.println(son instanceof Animal);
    System.out.println(son instanceof Mammal);
  }
}