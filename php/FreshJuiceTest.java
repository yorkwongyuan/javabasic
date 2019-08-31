class FreshJuice {
  enum FreshJuiceSize {
    LARGE, MEDIAL, SMALL
  }

  FreshJuiceSize size;
}

public class FreshJuiceTest {
  public static void main(String[] args) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.LARGE;
    System.out.println(juice.size);
  }
}