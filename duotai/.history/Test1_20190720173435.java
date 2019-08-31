public class Test1 {
  public static void main(String args[]) {
    Asia a = new Japan();
    a.getName();
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