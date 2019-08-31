public class Test1 {
  public static void main(String args[]) {
    Animal a = new Japan();
    a.getName();
    // a.abnormal();
  }
}

class Asia {
  public void getName() {
    System.out.println("Asia");
  }
}

class Japan extends Asia {
  public void getName() {
    System.out.println("Japan");
  }

  public void abnormal() {
    System.out.println("biantai");
  }
}

class China extends Asia {
  public void getName() {
    System.out.println("China");
  }
}