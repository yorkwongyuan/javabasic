public class Test1 {
  public static void main(String args[]) {
    Japan a = new Japan();
    a.getName1();
  }
}

class Asia {
  public void getName() {
    System.out.println("Asia");
  }
}

class Japan extends Asia {
  public void getName1() {
    System.out.println("Japan");
  }
}

class China extends Asia {
  public void getName() {
    System.out.println("China");
  }
}